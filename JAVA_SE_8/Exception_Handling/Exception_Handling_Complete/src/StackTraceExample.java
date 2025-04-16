public class StackTraceExample {
    public static void main(String[] args) {
        try{
        level1();} catch (Exception e) {
            //System.out.println(e);

//            StackTraceElement[] stackTrace=e.getStackTrace();
//            for(int i=0;i<stackTrace.length;i++){
//                System.out.println(stackTrace[i]);
//            }

            e.printStackTrace();
        }
    }

    public static void level1(){
        level2();
    }

    public static void level2(){
        level3();
    }

    public static void level3(){
        int array[]=new int[5];array[5]=10;
    }
}
