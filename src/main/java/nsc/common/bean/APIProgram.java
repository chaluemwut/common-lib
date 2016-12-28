package nsc.common.bean;

import java.io.Serializable;

public enum APIProgram implements Serializable {
    NEWS_FEED(1){
        @Override
        public String getAPICall() {
            return "newsfeed";
        }

        @Override
        public String getColor() {
            return "#1e88e5";
        }

        @Override
        public String getDisplay() {
            return "";
        }
    },
    NEWS(2){
        @Override
        public String getAPICall() {
            return "news";
        }

        @Override
        public String getDisplay() {
            return "ข่าวสาร";
        }

        @Override
        public String getColor() {
            return "#409805";
        }
    },
    PROMOTION(3){
        @Override
        public String getAPICall() {
            return "promotion";
        }

        @Override
        public String getDisplay() {
            return "โปรโมชัน";
        }

        @Override
        public String getColor() {
            return "#BF360C";
        }
    },
    PRODUCT(4){
        @Override
        public String getAPICall() {
            return "product";
        }

        @Override
        public String getDisplay() {
            return "สินค้า";
        }

        @Override
        public String getColor() {
            return "#00897B";
        }
    },
    LUCK_DRAW(5){
        @Override
        public String getAPICall() {
            return "luckdraw";
        }

        @Override
        public String getDisplay() {
            return "ชิงโชค";
        }

        @Override
        public String getColor() {
            return "#f9a825";
        }
    },
    CHAT(6){
        @Override
        public String getAPICall() {
            return "chat";
        }

        @Override
        public String getDisplay() {
            return "พูดคุย";
        }

        @Override
        public String getColor() {
            return "#1b5e20";
        }
    },
    ABOUTUS(7){
        @Override
        public String getAPICall() {
            return "aboutus";
        }

        @Override
        public String getDisplay() {
            return "เกี่ยวกับเรา";
        }

        @Override
        public String getColor() {
            return "#263238";
        }
    };


    public abstract String getAPICall();
    public abstract String getDisplay();
    public abstract String getColor();

    private int code;

    public int getCode() {
        return code;
    }

    APIProgram() {}
    
    APIProgram(int code) {
        this.code = code;
    }

    public static APIProgram fromInt(int type) {
        switch (type) {
            case 1:
                return APIProgram.NEWS_FEED;
            case 2:
                return APIProgram.NEWS;
            case 3:
                return APIProgram.PROMOTION;
            case 4:
                return APIProgram.PRODUCT;
            case 5:
                return APIProgram.CHAT;
            case 6:
                return APIProgram.ABOUTUS;
        }
        return null;
    }
}

