import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB9Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "Alice\nBob\nCarla\nDavid\nend\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB9.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学校に新入生が続々とやってきました！学生の名前を入力してください。入力が終わったら\"end\"と入力してください。\n\n学校のクラスリスト:\n学生1: Alice\n学生2: Bob\n学生3: Carla\n学生4: David";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
