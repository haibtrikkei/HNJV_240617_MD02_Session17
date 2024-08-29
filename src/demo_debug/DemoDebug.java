package demo_debug;

import java.util.Scanner;

public class DemoDebug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao 1 so nguyen: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("So ban vua nhap: "+n);
    }
}
