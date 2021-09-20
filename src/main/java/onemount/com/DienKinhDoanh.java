package onemount.com;

import java.util.Scanner;

public class DienKinhDoanh extends Dien{
    private int capDienAp;
    private double kwhCaoDiem;
    private double kwhBinhThuong;
    private double kwhThapDiem;
    private double tongTienDien;

    public DienKinhDoanh(int capDienAp, double kwhCaoDiem, double kwhBinhThuong, double kwhThapDiem, String tenKH, double soKwh) {
        super(tenKH, soKwh);
        this.capDienAp = capDienAp;
        this.kwhCaoDiem = kwhCaoDiem;
        this.kwhBinhThuong = kwhBinhThuong;
        this.kwhThapDiem = kwhThapDiem;
    }

    public DienKinhDoanh() {

    }

    public void inputKHKD() {
        super.inputKH();
        Scanner input = new Scanner(System.in);
        System.out.println("Cấp điện áp (Cao : 1, trung bình: 2, thấp: 3)");
        this.capDienAp = input.nextInt();

        System.out.println("Số Kwh giờ cao điểm : ");
        this.kwhCaoDiem = input.nextDouble();
        System.out.println("Số Kwh giờ bình thường : ");
        this.kwhBinhThuong = input.nextDouble();
        System.out.println("Số Kwh giờ thấp điểm : ");
        this.kwhThapDiem = input.nextDouble();

    }

    public String toString() {
        super.toString();
        String KH = "\nCấp điện áp : " + this.capDienAp + "\nSố kwh giờ cao điểm" + this.kwhCaoDiem +
                "\nSố kwh giờ bình thường" + this.kwhBinhThuong + "\nSố kwh giờ thấp điểm" + this.kwhThapDiem;
        return super.toString() + " " + KH;
    }

    public double tongTienDienTruocThue() {
        if(this.capDienAp == 1){
            tongTienDien = this.kwhCaoDiem * 4.251 + this.kwhBinhThuong * 1.361 + this.kwhThapDiem * 2.442;
        }else if (this.capDienAp == 2){
            tongTienDien = this.kwhCaoDiem * 4.400 + this.kwhBinhThuong * 1.547 + this.kwhThapDiem * 2.629;
        }else{
            tongTienDien = this.kwhCaoDiem * 4.587 + this.kwhBinhThuong * 1.622 + this.kwhThapDiem * 2.666;
        }
        return tongTienDien + ( tongTienDien * 0.1);
    }

}
