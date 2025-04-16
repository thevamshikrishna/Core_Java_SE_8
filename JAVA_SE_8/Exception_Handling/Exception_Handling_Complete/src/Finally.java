public class Finally {
    public static void main(String[] args) {
        try{
            System.out.println(div(2, 0));
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }
//        finally {
//            System.out.println("Using Finally");
//        }
    }

    public static int div(int a,int b){
        return a/b;
    }


}
