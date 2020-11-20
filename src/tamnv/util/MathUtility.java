/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamnv.util;

/**
 *
 * @author DELL
 */
public class MathUtility {
    
    //fake class Math giống như thật
    //Math.sqrt() .abs() .pow() . sin() .PI
    
    public static final double PI = 3.1415; // xài MathUtility.PI
    
    // tính n! = 1.2.3....n
    // 21! tràn long rồi, amm giai thừa k tính đc, vô nghĩa
    // 0! = 1! = 1
    // bài này mình chỉ tính giai thừa từ 0 .. 20
    // nếu đưa n cà chớn < 0 > 20 chửi, k trả về value nào luôn
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 .. 20");
        }
        if(n == 1 || n == 0)
            return 1; // n đặc biệt return luôn
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // tự tin hàm chạy đc
    //éo tin, phải test đã
    // có nhiều cách để test
    //kiểu gf cũng phải là: mình tính trước kết quả cần trả vê EXPECTED VALUE
    //                      mình chạy hàm coi nó chạy ra mấy, ACTUAL VALUE
    //so sánh coi EXPECTED VALUE == ACTUAL VALUE hay ko
    //                                  CÓ BẰNG, HÀM CHẠY ĐÚNG CHO TÌNH HUỐNG x
    //                                  KO BẰNG, HÀM CHẠY SAI CHO TÌNH HUỐNG x
    
    // vd:
    //tao nghĩ rằng 5! = 120 (expected)
    //giờ t gọi hàm getFactorial(5 đưa vào), coi ra kết quả mấy(actual)
    //nếu actual giả sử là 120 luôn ==> đúng
}
