package BaiTap;

import java.util.Scanner;

public class InRaHinhTamGiacVuong {
    // Các thể loại hinh tam giác vuông
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println(" Nhập số dòng của tam giác: ");
        number = sc.nextInt();
        for(int i = 1;i<=number;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/

   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println(" Nhập số dòng của tam giác: ");
        number = sc.nextInt();
        for(int i=number;i>=1;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/

   /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println(" Nhập số dòng của tam giác: ");
        number = sc.nextInt();
        for(int i=0;i<number;i++)
        {
            for(int j=0;j<number;j++)
            {
                if(j<i)
                {
                    System.out.print("   ");
                }
                else
                {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }*/
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number;
       System.out.println(" Nhập số dòng của tam giác: ");
       number = sc.nextInt();
       for(int i=1;i<=number;i++)
       {
           for(int j=0;j<number;j++)
           {
               if(j<number-i)
               {
                   System.out.print("   ");
               }
               else
               {
                   System.out.print(" * ");
               }
           }
           System.out.println();
       }

   }



}
