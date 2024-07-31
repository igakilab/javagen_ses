import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkBaTest {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkBa.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "新入生のクラス分けを行います。\n学生の名前を入力してください。(終了するには q を入力)\nana\nbob\nquinn\nmickey\nq\nクラスA:\nana\nbob\nmickey\nクラスB:\nqui";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }

    @Test
    public void mainTest2() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkBa.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "新入生のクラス分けを行います。\n学生の名前を入力してください。(終了するには q を入力)\nalice\nben\ndavid\nmandy\noak\nq\nクラスA:\nalice\ndavid\nmandy\noak\nクラスB:\nbe";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
