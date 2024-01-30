public class Say {

    private String ones(int number){
        switch(number){
            case 0 :
                return "zero";
            case 1 :
                return "one";
            case 2 :
                return "two";
            case 3 :
                return "three";
            case 4 :
                return "four";
            case 5 :
                return "five";
            case 6 :
                return "six";
            case 7 :
                return "seven";
            case 8 :
                return "eight";
            case 9 :
                return "nine";
            default :
                return "";
        }
    }

    private String teens(int number){
        switch(number){
            case 10 :
                return "ten";
            case 11 :
                return "eleven";
            case 12 :
                return "twelve";
            case 13 :
                return "thirteen";
            case 14 :
                return "fourteen";
            case 15 :
                return "fifteen";
            case 16 :
                return "sixteen";
            case 17 :
                return "seventeen";
            case 18 :
                return "eighteen";
            case 19 :
                return "nineteen";
            default :
                return "";
        }
    }

    private String tens(int number){
        switch(number){
            case 1 :
                return "ten";
            case 2 :
                return "twenty";
            case 3 :
                return "thirty";
            case 4 :
                return "forty";
            case 5 :
                return "fifty";
            case 6 :
                return "sixty";
            case 7 :
                return "seventy";
            case 8 :
                return "eighty";
            case 9 :
                return "ninety";
            default :
                return "";
        }
    }

    private String convert(long number, int divisor, String name) {
        int part = (int) (number / divisor);
        int rest = (int) (number % divisor);
        if (rest > 0) {
            return say(part) + name + " " + say(rest);
        }
        return say(part) + name;
    }

    public String say(long number) {
        if (number < 0 || number >= 1_000_000_000_000L) {
            throw new IllegalArgumentException();
        }
        if (number < 10) {
            return ones((int) number);
        } else if (number < 20) {
            return teens((int) number);
        } else if (number < 100) {
            int tens = (int) (number / 10);
            int rest = (int) (number % 10);
            if (rest > 0) {
                return tens(tens) + "-" + say(rest);
            }
            return tens(tens);
        } else if (number < 1_000) {
            return convert(number, 100, " hundred");
        } else if (number < 1_000_000) {
            return convert(number, 1_000, " thousand");
        } else if (number < 1_000_000_000L) {
            return convert(number, 1_000_000, " million");
        } else {
            return convert(number, 1_000_000_000, " billion");
        }
    }
}
