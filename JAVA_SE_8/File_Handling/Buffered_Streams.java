import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffered_Streams {
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("C:\\Users\\VamshiNallavalli\\Downloads\\File.txt"));
            bw = new BufferedWriter(new FileWriter("C:\\Users\\VamshiNallavalli\\Downloads\\Hello.txt"));
            String x;
            while ((x = br.readLine()) != null) {
                bw.write(x);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (br != null) {
                br.close(); // Close the BufferedReader
            }
            if (bw != null) {
                bw.close(); // Correctly close the BufferedWriter
            }
        }

    }
}