package demo_stackoverflow;

public class DemoStachOverFlow {
    public int myfunction(int n){
        return n*myfunction(n-1);
    }

    public static void main(String[] args) {
        DemoStachOverFlow obj = new DemoStachOverFlow();
        System.out.println("Giai thua: "+obj.myfunction(1000));
    }
}
