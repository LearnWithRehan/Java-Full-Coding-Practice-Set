import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Program72 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("src", "test.txt");

        if (!Files.exists(path)) {
            System.out.println("File not found: " + path.toAbsolutePath());
            return;
        }

        String content = Files.readString(path);

        System.out.println(content);
    }
}