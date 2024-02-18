package ar.com.lambdastuto.java9;

public class SwitchStatements {

    public static void main(String[] args) {

        String month = "MAY";
        String quarter= "";
        switch(month){
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                quarter = "FIRST QUARTER";
                break;
            case "APRIL":
            case "MAY":
            case "JUN":
                quarter = "SECOND QUARTER";
                break;
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                quarter = "THIRD QUARTER";
                break;
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                quarter ="FOUR QUARTER";
        }
        System.out.println("quarter: "+ quarter);

        System.out.println("quarter by lambda FEBRUARY : "+ printQuarterByLambda("FEBRUARY"));
        System.out.println("quarter by lambda MAY: "+ printQuarterByLambda("MAY"));
        System.out.println("quarter by lambda SEPTEMBER: "+ printQuarterByLambda("SEPTEMBER"));
        System.out.println("quarter by lambda DECEMBER: "+ printQuarterByLambda("DECEMBER"));
    }

    public static String printQuarterByLambda(String month){
        // without lambda it does not compile
        String quarter = switch(month){
            case "JANUARY", "FEBRUARY",  "MARCH" -> "FIRST QUARTER";
            case "APRIL", "MAY", "JUN" -> "SECOND QUARTER";
            case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD QUARTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOUR QUARTER";
            default -> "UNKNOWN";
        };
        return quarter;
        }

}
