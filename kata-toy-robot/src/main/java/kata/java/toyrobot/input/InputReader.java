package kata.java.toyrobot.input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputReader {

    public List<String> readInput(String inputFileName)
    {
        try (Stream<String> stream = Files.lines(Paths.get(inputFileName))) {

            return stream.collect(Collectors.toList());

        } catch (IOException ioe) {
            ioe.printStackTrace();
            throw new RuntimeException(ioe.getMessage());
        }
    }

}
