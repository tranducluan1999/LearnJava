package LopString;

public class App {
    public static void main(String[] args) {
        String c ="Xin chao,  I'm Java!!!"; // Lấy độ dài chuỗi
        System.out.println(c.length());

        String noichuoi = "Hello Java===";

        System.out.println(c.concat(noichuoi)); // CONCAT: dùng để nối 2 chuỗi với nhau
        System.out.println( c.charAt(7)); //CharAt(index) : trả về kí tự tại vị trí index trong chuỗi
        boolean ckeck = c.endsWith("!!!"); // endsWith(): Kiểm tra chuỗi kết thúc bằng đúng chuỗi được chỉ định hay không?
        System.out.println(ckeck);
        ckeck =c.startsWith("Xin"); // StartsWith(): tương tự như EndsWith;
        //Equal && EqualIgnoreCase : So sánh 2 chuỗi
        System.out.println(c.split("",4));


    }
}
