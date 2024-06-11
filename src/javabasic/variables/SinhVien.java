package javabasic.variables;

public class SinhVien {
    // biến instance "ten" kiểu String, có giá trị mặc định là null
    public String ten;

    // biến instance "tuoi" kiểu Integer, có giá trị mặc định là 0
    private int tuoi;

    // sử dụng biến ten trong một constructor
    //constructor là hàm có tên trùng với tên class
    public SinhVien(String ten) {
        this.ten = ten;
        //this dùng để phân biệt khi 2 tên biến giống nhau để phân biệt biến ở ngoài truyền vào và biến ở trong phương thức
    }

    // sử dụng biến tuoi trong phương thức setTuoi
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void showStudent() {
        System.out.println("Ten  : " + ten);
        System.out.println("Tuoi : " + tuoi);
    }

    public static void main(String args[]) {
        SinhVien sv = new SinhVien("Nguyen Van A");
        sv.setTuoi(21);
        sv.showStudent();
    }
}
