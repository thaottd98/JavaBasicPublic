package javabasic.variables;

public class StaticVariables {
    int tuoi = 20; //Biến toàn cục
    static int age = 30;// biến static
    //mang giá trị suốt quá trình chạy code.
    //Biến này có thể gọi trực tiếp vào hàm main hoặc 1 hàm có trạng thái là static
//Dùng khi muốn lưu 1 giá trị nào đó tồn tại trong suốt quá trình project đó nó thực thi
    public static void main(String[] args) {
        StaticVariables staticVariables = new StaticVariables();
        System.out.println("Tuổi: " + age);
        System.out.println("Tuổi: " + staticVariables.tuoi);
    }
}

