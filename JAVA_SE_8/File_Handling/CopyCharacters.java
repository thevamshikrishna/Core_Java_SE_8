import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CopyCharacters {
    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("C:\\Users\\VamshiNallavalli\\Downloads\\HelloWorld.txt");
            out = new FileWriter("C:\\Users\\VamshiNallavalli\\Downloads\\World.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            // Close the FileReader and FileWriter if they were opened
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
