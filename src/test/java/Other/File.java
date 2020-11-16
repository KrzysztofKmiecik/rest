package Other;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;


public class File {
    @Test
    void readFile() throws IOException {
        Path path = Paths.get("src/main/resources/file1");
        List<String> list = Files.readAllLines(path, Charset.defaultCharset());
        list.stream().forEach(System.out::println);
    }

    @Test
    void write () throws IOException {
        Files.write(Paths.get("src/main/resources/file1"), "new TEXT \n".getBytes(), StandardOpenOption.APPEND);

    }



}
