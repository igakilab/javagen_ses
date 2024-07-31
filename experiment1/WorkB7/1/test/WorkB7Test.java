import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB7Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "Alice\n女性\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB7.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "新しい生徒の名前を入力してください:\n新しい生徒の性別を入力してください (男性/女性):\n新しい生徒が登録されました。";
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
        input = "Bob\n男性\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB7.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "新しい生徒の名前を入力してください:\n新しい生徒の性別を入力してください (男性/女性):\n新しい生徒が登録されました。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }

    @Test
    public void mainTest3() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "Charlie\n男性\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB7.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "新しい生徒の名前を入力してください:\n新しい生徒の性別を入力してください (男性/女性):\n新しい生徒が登録されました。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
