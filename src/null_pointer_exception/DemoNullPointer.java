package null_pointer_exception;

import demo_throw.DemoThrow;

public class DemoNullPointer {
    public static void main(String[] args) {
        DemoThrow obj = null;
        
        obj.hello("Cuong");
    }
}
