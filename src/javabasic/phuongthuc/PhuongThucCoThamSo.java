package javabasic.phuongthuc;

public class PhuongThucCoThamSo {

    static float interest_rate = 7.3F;

    public static double tinhLai(long soTienGui) {

        return (soTienGui * interest_rate / 100);
    }

    public static double cong2So(double number1, double number2) {

        return number1 + number2;
    }

    public static void main(String[] args) {
        System.out.println("Tổng tiền lãi: " + tinhLai(50000000));
        System.out.println("Cộng 2 số: " + cong2So(7.3F, 2.1F));
    }

}
