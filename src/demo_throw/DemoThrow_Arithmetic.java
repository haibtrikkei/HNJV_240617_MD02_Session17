package demo_throw;

import javax.naming.AuthenticationException;

public class DemoThrow_Arithmetic {
    public double canBacHai(int n){
        if(n<0)
            throw new ArithmeticException("Khong co ban hai cua so am");
        return Math.sqrt(n);
    }
}
