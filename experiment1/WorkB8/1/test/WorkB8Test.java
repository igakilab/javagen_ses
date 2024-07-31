import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB8Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "Alice\n25\nBob\n30\nEve\n35\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB8.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "Person 1\nEnter name:\nEnter age:\nPerson 2\nEnter name:\nEnter age:\nPerson 3\nEnter name:\nEnter age:\nTotal age: 90";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
