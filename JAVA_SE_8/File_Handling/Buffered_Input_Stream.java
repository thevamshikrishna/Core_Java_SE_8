import java.io.*;

public class Buffered_Input_Stream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;

        try{
            bis=new BufferedInputStream(new FileInputStream("C:\\Users\\VamshiNallavalli\\Downloads\\Hello.txt") {
            });
            bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\VamshiNallavalli\\Downloads\\InputStream.txt"));

            Integer x;
            while((x= bis.read())!=-1){
                bos.write(x);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        finally {
            if(bis!=null)
                bis.close();
            if(bos!=null)
                bos.close();
        }
    }
}
