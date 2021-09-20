package onemount.com;

import java.util.Scanner;

public class Dien {
    private String tenKH;
    protected double soKwh;

    public Dien(String tenKH, double soKwh) {
        this.tenKH = tenKH;
        this.soKwh = soKwh;
    }

    public Dien() {

    }

    public void inputKH() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tên khách hàng : ");
        this.tenKH = input.nextLine();

        System.out.println("Số Kwh sử dụng trong tháng : ");
        this.soKwh = input.nextDouble();
    }

    public String toString() {
        String KH = "Họ & tên : " + this.tenKH + "\n Số kwh sử dụng trong tháng: " + this.soKwh;
        return KH;
    }

    public double tongTienDienTruocThue() {
        return 0;
    }
}
