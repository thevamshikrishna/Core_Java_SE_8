import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyBytes{
    public static void main(String args[]) throws IOException {
        FileInputStream in=null;
        FileOutputStream out=null;

        try{
            in=new FileInputStream("C:\\Users\\VamshiNallavalli\\Downloads\\HelloWorld.txt");
            out=new FileOutputStream("C:\\Users\\VamshiNallavalli\\Downloads\\Hello.txt");
            int c;

            while((c=in.read())!=-1){
                out.write(c);
            }
        }
        finally {
            while(in!=null){
                in.close();
            }

            while(out!=null){
                out.close();
            }
        }
    }
}