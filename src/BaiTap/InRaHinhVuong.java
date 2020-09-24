package BaiTap;

import java.util.Scanner;

public class InRaHinhVuong {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Nhập chiều rộng: ");
        int cr = sc.nextInt();

        System.out.println(" Nhập chiều cao: ");
        int cc = sc.nextInt();
        for(int i=0;i<cc;i++)
        {
            for(int j=0;j<cr;j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
}
