public class ExceptionPrac1 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;

            System.out.println("Result: " + (a + b) + c);
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception");
        }
        catch (NumberFormatException e) {
            System.out.println("NUmber format exception");
        }
    }
}