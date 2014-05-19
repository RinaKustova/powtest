/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pow;
import org.junit.*;
import static org.junit.Assert.*;
/**
 *
 * @author Екатерина
 */
public class TestPow {
    @Test(expected = Exception.class)
    public void testPow(){
        op_pow val1 = new op_pow(3);
        op_pow val2 = new op_pow(3);
        op_pow exp = new op_pow(27);
        op_pow res = val1.pow(val2);
        
        
        assertEquals(res,exp);
        assertEquals(new op_pow(4).pow(new op_pow(2)),new op_pow(16));
        assertNotNull(val1);
        assertNotNull(val2);
       
    }
}
