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
        input = "Alice\n2000-01-01\nBob\n1995-05-20\nend\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB9.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "友達の名前と誕生日を入力してください（名前が\"end\"の場合、入力を終了します）\n友達の名前と誕生日を入力してください（名前が\"end\"の場合、入力を終了します）\n友達の名前と誕生日を入力してください（名前が\"end\"の場合、入力を終了します）\n友達の誕生日リスト\nAlice : 2000-01-01\nBob : 1995-05-20";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
