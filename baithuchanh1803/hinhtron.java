
public class hinhtron{
    
        static void main(String[] args) {
            // ... code gì trong này bạn đừng quan tâm
        }
         
        // Khai báo một Lớp Hình tròn
        class HinhTron {
                 
            // Dưới đây là các Thuộc tính
            final float PI = 3.14f;
            float r;
            float cv;
            float dt;
         
            // Dưới đây là các Phương thức
            void nhapBanKinh() {
                System.out.println("Hãy nhập vào Bán kính Hình tròn: ");
                try (Scanner scanner = new Scanner(System.in)) {
                    r = scanner.nextFloat();
                }
            }
         
            void tinhChuVi() {
                cv = 2 * PI * r;
            }
         
            void tinhDienTich() {
                dt = PI * r * r;
            }
         
            void inChuVi() {
                System.out.println("Chu vi Hình tròn: " + cv);
            }
         
            void inDienTich() {
                System.out.println("Diện tích Hình tròn: " + dt);
            }
        }
}