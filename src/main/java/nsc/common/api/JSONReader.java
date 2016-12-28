package nsc.common.api;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

//http://stackoverflow.com/questions/33353508/adding-jsonpath-in-android-studio-causes-non-zero-exit-value-2-error

public class JSONReader {

	public static <T> T readData(String jsonString, String XPath, TypeReference ref) throws JsonProcessingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List dataList = JsonPath.read(jsonString, XPath);
		return mapper.readValue(mapper.writeValueAsString(dataList), ref);
	}
}
