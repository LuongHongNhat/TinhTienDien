package onemount.com;

import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int numberOfCustomer;
        int typeOfCustomer;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of customer:");
        numberOfCustomer = sc.nextInt();
        ArrayList<Dien> listOfCustomer = new ArrayList<>();

        for (int i = 0; i < numberOfCustomer; i++) {
            sc = new Scanner(System.in);
            System.out.println("Type of customer (Sinh hoạt : 1, kinh doanh : 2): ");
            typeOfCustomer = sc.nextInt();
            if(typeOfCustomer == 1 ){
                DienSinhHoat new_KH = new DienSinhHoat();
                new_KH.inputKHSH();
                listOfCustomer.add(new_KH);
            }else if ( typeOfCustomer == 2){
                DienKinhDoanh new_KH = new DienKinhDoanh();
                new_KH.inputKHKD();
                listOfCustomer.add(new_KH);
            }else{
                System.out.println("Dữ liệu không hợp lệ");
            }
            
        }

        for (int i = 0; i < listOfCustomer.size(); i++) {
            System.out.println("Thông tin khách hàng thứ " + (i +1) +"\n "+listOfCustomer.get(i).toString());
        }

       for (int i = 0; i < listOfCustomer.size(); i++) {
          System.out.println(" Giá điện sau thuế là " +listOfCustomer.get(i).tongTienDienTruocThue());
        }

    }
}
