package javabasic.phuongthuc;

public class Bank {
    static int vat = 10000;
    static float interest_rate = 7.3F;
    static int number1 = 10000;
    static String bankName = "Vietinbank";
    static float number2 = 10000.5F;
    static String address = "Hanoi";
    static String phone = "03232837822";

    public static void getInfoBank(){
        System.out.println("Bank name: " + bankName);
        System.out.println("Bank Address: " + address);
        System.out.println("Bank Phone: " + phone);
        System.out.println("Bank interest rate: " + interest_rate);
    }
    public static float getInteresRate(){

        return interest_rate;
    }
}
