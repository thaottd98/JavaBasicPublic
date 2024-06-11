package javabasic.variables;

public class LearnVariables {
    static int age = 26; //biến toàn cục
    //Biến toàn cục được khai báo trong một class, bên ngoài các phương thức, constructor và các block


    public static void sayHello(){
        int n = 10; // Đây là biến local
        System.out.println("Gia tri cua n la:" + n);
        //Biến cục bộ khai báo trong phương thức, hàm constructor hoặc các block
        //chỉ dùng được trong hàm hoặc phương thức được khai báo
        //Muốn sử dụng biến cục bộ trong 1 hàm thì phải cần phải khởi tạo giá trị mặc định cho biến local
    }
    public static void main(String[] args) {
        System.out.println(age);
        //cách 1
        LearnVariables bienLocal = new LearnVariables();
        bienLocal.sayHello();
        //cách 2
        //nếu hàm có thêm từ khóa static thì sẽ gọi trực tiếp
        sayHello();
    }
}
