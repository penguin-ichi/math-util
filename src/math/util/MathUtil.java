/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import tamnv.util.MathUtility;

/**
 *
 * @author DELL
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // kỹ thuật test căn bản: nhìn bằng mắt
        // Đúng, sai
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        // kỳ vọng 120, mày chạy ra gì t lưu ở actual
        // so sánh = mắt
        System.out.println("5! ? expected: " + expected + "; actual: " + actual);
        System.out.println("5! ? expected: 720; actual: " + MathUtility.getFactorial(6));
        System.out.println("5! ? expected: 1; actual: " + MathUtility.getFactorial(0));
        System.out.println("5! ? expected: 1; actual: " + MathUtility.getFactorial(1));
        
        
        // t kỳ vọng m nép về ngoại lệ nếu t đưa âm giai thừa
        MathUtility.getFactorial(-5);
        // k sout vì chết ngay khi gọi hàm r
        // chống mắt xem có đúng ngoại lẹ như mình cần như thiết kế để chửi thằng xài hàm k đúng
        
        // nhược điểm của kỹ thuật này:
        // cần phải dùng mắt để so sánh từng trường hợp xài hàm so expected và actual
        // nếu test nhiều tình huống, mắt đủ mệt mổi vì phải dò từng input
        
        //CÁCH NÂNG CAO
        // gom cả đám test cases này lại, chạy 1 lượt như ở trên
        // máy so giùm ta luôn expected và actual
        // sau đó
        // NẾU TẤT CẢ CÁC CASES MÀ ĐỀU ĐÚNG, THẢY RA 1 MÀU XANH - ĐÈN XANH - CODE ỔN
        // NẾU TẤT CẢ CÁC CASES MÀ ĐỀU ĐÚNG, NGOÀI 1, 2 TRƯỜNG HỢP SAI
        // EXPECTED KHÁC ACTUAL, THẢY RA 1 MÀU ĐỎ, HÀM Ý, HÀM SAI RỒI
        //                    HÀM ĐÚNG GẦN HẾT, SAI 1 VÀI, K TIN CẬY HÀM
        //ĐỎ: CHỈ CÓ ÍT NHẤT 1 CẶP EXPECTED ACTUAL K BẰNG NHAU, KẾT LUẬN HÀM SAI
        //THAY VÌ NHÌN TỪNG CASE: TA CHỈ CẦN NHÌN MÀU XANH MÀY ĐỎ
        // TA CẦN THÊM BỘ THƯ VIỆN ĐỂ GIÚP TA LÀM VIỆC NÀY
        //BỘ THƯ VIỆN LÀM 2 VIỆC: SO SÁNH GIÙM EXPECTED VÀ ACTUAL
        //                        KHỚP THẢY RA MÀU XANH
        //                        K KHỚP THẢY RA MÀU ĐỎ
        // NÓ TỰ QUÁT HẾT CÁC CASE MÀ MÌNH ĐÃ THIẾT KÉ ĐỂ NÓ KẾT LUẬN MẮT NHÌN DUY NHẤT MÀU LÀ ĐỦ
        //
                                        
        
    }

}
