package onemount.com;

import java.util.Scanner;

public class DienSinhHoat extends Dien{

        private int type;
        private double tongTienDien;

        public DienSinhHoat(int type, String tenKH, double soKwh) {
                super(tenKH, soKwh);
                this.type = type;
        }
        public DienSinhHoat() {

        }
        public void inputKHSH() {
                super.inputKH();
                Scanner input = new Scanner(System.in);
                System.out.println("Nhập loại ( Buôn bán : 1, bán lẻ : 2 ) ");
                this.type = input.nextInt();
        }

        public String toString() {
                super.toString();
                String KH = "\n Loại sử dụng: " + this.type;
                return super.toString() + " " + KH;
        }

        public double tongTienDienTruocThue() {
                if(this.type == 1){
                    if (this.soKwh <= 50){
                            tongTienDien = this.soKwh * 1.646;
                    }else if (this.soKwh <= 100){
                            tongTienDien = (50 * 1.646) + ((this.soKwh - 50 ) * 1.701);
                    }else if (this.soKwh <= 200){
                            tongTienDien = (50 * 1.646) + (50 * 1.701) + ((this.soKwh - 100 ) * 1.976);
                    }else if (this.soKwh <= 300){
                            tongTienDien = (50 * 1.646) + (50 * 1.701) + (100 * 1.976) + ((this.soKwh - 200 ) * 2.487) ;
                    }else if (this.soKwh <= 400){
                            tongTienDien = (50 * 1.646) + (50 * 1.701) + (100 * 1.976) + (100 * 1.2487) + ((this.soKwh - 300 ) * 27.80);
                    }else{
                            tongTienDien = (50 * 1.646) + (50 * 1.701) + (100 * 1.976) +  (100 * 1.2487) +
                                    (100 * 2.780) + ((this.soKwh - 400) * 2.871);
                    }

                }else {
                    if (this.soKwh <= 50){
                            tongTienDien = this.soKwh * 1.678;
                    }else if (this.soKwh <= 100){
                            tongTienDien = (50 * 1.678) + ((this.soKwh - 50 ) * 1.734);
                    }else if (this.soKwh <= 200){
                            tongTienDien = (50 * 1.678) + (50 * 1.734) + ((this.soKwh - 100 ) * 2.014);
                    }else if (this.soKwh <= 300){
                            tongTienDien = (50 * 1.678) + (50 * 1.734) + (100 * 2.014) + ((this.soKwh - 200 ) * 2.536) ;
                    }else if (this.soKwh <= 400){
                            tongTienDien = (50 * 1.678) + (50 * 1.734) + (100 * 2.014) + (100 * 2.536) + ((this.soKwh - 300 ) * 2.834);
                    }else{
                            tongTienDien = (50 * 1.678) + (50 * 1.734) + (100 * 2.014) +  (100 * 2.536) +
                                   (100 * 2.834) + ((this.soKwh - 400) * 2.927);
                    }
                }
                return tongTienDien + (0.1 * tongTienDien);
        }
}
