import java.io.File;

class File_Methods {
    public static void main(String args[]){
        try{
            File f=new File("C:\\Users\\VamshiNallavalli\\Downloads\\HelloWorld.txt");
            if(f.exists())
                System.out.println("File Exists");
            else
                System.out.println("File Not Exists");

            f.getParentFile().mkdirs();

            if(f.createNewFile())
                System.out.println("File Created :"+f.getName());
            else
                System.out.println("File not Created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}