package javabasic.phuongthuc;

public class PhuongThucBank {
    public static void main(String[] args) {
        Bank.getInfoBank();
        //Hàm có trả về là có thể lấy giá trị ở hàm có trả về và thực hiện tính toán
        double tongTien = (Bank.getInteresRate()*100000000)/100;
        System.out.println("Tổng tiền lãi: " + tongTien);
    }
}
