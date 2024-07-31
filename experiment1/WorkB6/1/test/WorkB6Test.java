import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB6Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "Alice\n22\nBob\n25\nCharlie\n20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "新入生の名簿作成を開始します。\n新入生の名前を入力してください:\n新入生の年齢を入力してください:\n新入生の名前を入力してください:\n新入生の年齢を入力してください:\n新入生の名前を入力してください:\n新入生の年齢を入力してください:\n\n新入生の名簿:\n名前: Alice, 年齢: 22\n名前: Bob, 年齢: 25\n名前: Charlie, 年齢: 20";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
