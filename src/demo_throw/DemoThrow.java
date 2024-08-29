package demo_throw;

import java.util.NoSuchElementException;

public class DemoThrow {
    public void hello(String name) throws NoSuchElementException{
        if(name.isBlank())
            throw new NoSuchElementException("Khong ton tai phan nao nhu vay (lien quan den tim kiem)");
    }
}
