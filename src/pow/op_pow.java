/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pow;

/**
 *
 * @author Екатерина
 */
public class op_pow {
    private int value;
    
    
    
    public op_pow(int v){
          value = v;
          
    }
    
    public op_pow pow(op_pow v1){
        //return new op_pow (value^v1.getValue());
        return new op_pow ((int) Math.pow(value,v1.getValue()));
    }
    public int getValue(){
        return value;
    }
     public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        op_pow other = (op_pow) obj;
        if (value != other.value)
            return false;
        
        return true;
    }
}
