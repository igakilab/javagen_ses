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
        String answer = "学生のデータを入力してください\n名前: Alice\n年齢: 20\n名前: Bob\n年齢: 22\n名前: Charlie\n年齢: 25\n名前: end\n\n登録した学生の情報:\n名前: Alice, 年齢: 20\n名前: Bob, 年齢: 22\n名前: Charlie, 年齢: 25";
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
        String answer = "学生のデータを入力してください\n名前: Emily\n年齢: 18\n名前: David\n年齢: 21\n名前: end\n\n登録した学生の情報:\n名前: Emily, 年齢: 18\n名前: David, 年齢: 21";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
