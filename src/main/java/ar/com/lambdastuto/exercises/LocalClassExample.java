package ar.com.lambdastuto.exercises;

public class LocalClassExample {

    static String regularExpression = "[ˆ0-9]";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2){

        final int numberLength = 10;

        class PhoneNumber{
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if(currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber(){
                return formattedPhoneNumber;
            }

            public void printOriginalNumbers(){
                System.out.println("Original numbers are " + phoneNumber1 + " and " + phoneNumber2);
            }
        }

        PhoneNumber numberOne = new PhoneNumber(phoneNumber1);
        PhoneNumber numberTwo = new PhoneNumber(phoneNumber2);

        numberOne.printOriginalNumbers();

        if(numberOne.getNumber() == null)
            System.out.println("Fist number is invalid");
        else
            System.out.println("First number is " + numberOne.getNumber());
        if(numberTwo.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + numberTwo.getNumber());

    }

    public static void main(String[] args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}
