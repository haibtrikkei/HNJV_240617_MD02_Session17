package null_pointer_exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo_FileNotFoundException {
    public static void main(String[] args) {
        File f = new File("src/data/data.txt");
        BufferedWriter ghi = null;
        try {
            ghi = new BufferedWriter(new FileWriter(f));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                ghi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
