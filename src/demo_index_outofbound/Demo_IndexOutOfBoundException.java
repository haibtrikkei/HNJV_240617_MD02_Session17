package demo_index_outofbound;

public class Demo_IndexOutOfBoundException {
    public static void main(String[] args) {
        String today = "Hoc ve ngoai le";
        System.out.println(today.charAt(0));
        System.out.println(today.charAt(20));
    }
}
