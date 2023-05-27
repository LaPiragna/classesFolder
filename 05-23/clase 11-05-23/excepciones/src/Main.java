import Exceptions.*;
import java.time.DateTimeException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BankAcc bankAcc = new BankAcc(10000, "1");
        try {
            //System.out.println(ex1(2, 0));
            //System.out.println(ex2("String input"));
            //ex3(3);
            //ex4(1);
            //System.out.println("$" + bankAcc.ex5(9888) + " available.");
            //System.out.println(ex6(-6));
            //System.out.println(ex8(2));
            System.out.println(ex9("Contrase;a1"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static public float ex1(int a, int b) throws ArithmeticException {
        if (b == 0)
            throw new DivisionByCero();
        else
            return (float) a / b;
    }
    static public int ex2(Object input) throws NumberFormatException{
        if (input instanceof String)
        {
            return ((String) input).length();
        } else{
            throw new MyNumberFormatException();
        }
    }
    static public void ex3(int index) throws ArrayIndexOutOfBoundsException {
        Random random = new Random();
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        if (index < 0 || index > 1) {
            throw new MyArrayIndexOutOfBoundsException();
        }else
            System.out.println(array[index]);
    }
    static public void ex4(float raiuds) throws IllegalArgumentException{
        if (raiuds < 0) {
            throw new MyIllegalArgumentException("possitive number needed");
        } else
            System.out.println(Math.PI * Math.pow(raiuds, 2));
    }
    static public int ex6(int input) {
        if (!(input <= -1)) {
            int ret = 1;
            if (input > 0)
                ret = input * ex6(input - 1);
            return ret;
        }
        else
            throw new MyIllegalArgumentException("error: negative number received.");
    }
    static public void ex7(String date) throws DateTimeException {
        if (date == null || date.isEmpty()) {
            throw new MyDateTimeException("null date");
        }
        // Check if the date has the correct format "dd/mm/yyyy"
        if (!date.matches("\\d{2}/\\d{2}/\\d{4}")) {
            throw new MyDateTimeException("invalid format");
        }
        // Split the date into day, month and year
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        // Check if the month is valid
        if (month < 1 || month > 12) {
            throw new MyDateTimeException("invalid month");
        }
        // Check if the year is valid
        if (year < 0) {
            throw new MyDateTimeException("invalid year");
        }
        // Check if the day is valid for the given month and year
        int maxDay = 31; // Default value for most months
        switch (month) {
            case 2: // February
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                maxDay = 30;
                break;
            default:
                break;
        }
        if (day < 1 || day > maxDay) {
            throw new MyDateTimeException("invalid day");
        }
    }
    static float ex8(int cathegory) throws InvalidCategoryException{
        float ret = 0;
        if (cathegory < 1 || cathegory > 4) {
            throw new InvalidCategoryException("invalid cathegory entered");
        } else {
            System.out.println("product name: ");
            String productName = scanner.nextLine();
            System.out.println("product price: ");
            float productPrice = scanner.nextFloat();
            Producto product = new Producto(cathegory, productName, productPrice);
            product.aplicarImpuesto();
            ret = productPrice + (productPrice * product.getImpuesto());
        }
        return ret;
    }
    static public boolean isValidString(String str) {
        // Check if the string is null or empty
        if (str == null || str.isEmpty()) {
            return false;
        }
        // Check if the string has at least 8 characters and at most 15 characters
        if (str.length() < 8 || str.length() > 15) {
            return false;
        }
        // Check if the string has at least one uppercase letter
        boolean hasUppercase = false;
        // Check if the string has at least one number
        boolean hasNumber = false;
        // Loop through each character of the string
        for (char c : str.toCharArray()) {
            // If the character is an uppercase letter, set hasUppercase to true
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            // If the character is a digit, set hasNumber to true
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
            // If both conditions are met, no need to continue the loop
            if (hasUppercase && hasNumber) {
                break;
            }
        }
        // Return true if both conditions are met, false otherwise
        return hasUppercase && hasNumber;
    }
    static public boolean ex9(String password) throws InvalidPasswordException{
        boolean flag = isValidString(password);
        if (flag)
            return true;
        else
            throw new InvalidPasswordException("invalid password");
    }
}
