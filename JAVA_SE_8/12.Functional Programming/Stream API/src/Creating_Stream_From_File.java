import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Creating_Stream_From_File {
    public static void main(String[] args) {
        try {
            Path filePath = Path.of("C:/Users/VamshiNallavalli/Downloads/File.txt");
            Stream<String> stream = lines(filePath);
            stream.forEach(System.out::println);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Stream<String> lines(Path path) throws IOException {
        return Files.lines(path);
    }
}