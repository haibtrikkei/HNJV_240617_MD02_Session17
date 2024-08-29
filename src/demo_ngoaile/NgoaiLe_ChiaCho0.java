package demo_ngoaile;

public class NgoaiLe_ChiaCho0 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println("a/b="+a/b);
        }catch (ArithmeticException ex){
            System.out.println("Co loi: "+ex.getMessage());
            ex.printStackTrace();
        }catch (Exception ex){
            System.out.println("Co loi: "+ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println("Thuc hien tiep cac cau lenh ben duoi...");
    }
}
