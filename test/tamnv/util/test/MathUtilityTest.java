/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamnv.util.test;

import org.junit.Test;
import static org.junit.Assert.*;

import static tamnv.util.MathUtility.*;
// chỉ có từ JDK 5, chỉ dành cho static
// tức là khi chơi trò import static , thì mọi hàm static trong class này khi gọi thì k cần tên class CHẤM, gọi như C, hiểu ngầm đã CHẤM r


public class MathUtilityTest {
    
    // class này là class xài bộ thư viên Junit  dùng để test code theo dạng xanh đỏ thay vì nhìn = mắt bên main() sout()

    //2 file .jar đã dc add vào project này, và ta thoải mái xài các hàm của nó
    //Trong các hàm của thư viên này có n hàm đặt biệt đều có tên xuất phát là assertX(expected và actual đưa vào)
    //nếu nó thấy expected k bằng actual, nó thảy màu đỏ
    //                  có bằng, nó thảy màu xanh
    //Quy tắc xanh đỏ: NẾU TẤT CẢ XANH --> KẾT LUẬN XANH
    //                 NẾU CÓ ÍT NHẤT 1 ĐỎ, ÉO QUAN TÂM CÒN LẠI --> KẾT LUẬN ĐỎ
    
    //ĐẢM BẢO: hàm chạy đúng mọi CASE, trường hợp
    @Test //biến hàm ngay sau đây thành public static void main()
    // muốn chạy thì nhấn SHIFT-F6
    //Quy tắc đặt tên của nghề Tester, QC
    public void getFactirial_RunsWell_IfValidArgument() {
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument() {
        // ngoại lệ k phải là value để assert()
        // chỉ có thể chụp nó lại
        getFactorial(-5);
    }
    
}
