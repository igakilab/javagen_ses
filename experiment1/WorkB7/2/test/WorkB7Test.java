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
        input = "Bob\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB7.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "生徒一覧:\nAlice\nBob\nCharlie\n削除する生徒の名前を入力してください:\n生徒 Bob を削除しました。\n削除後の生徒一覧:\nAlice\nCharlie";
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
        input = "Dave\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB7.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "生徒一覧:\nAlice\nBob\nCharlie\n削除する生徒の名前を入力してください:\n削除後の生徒一覧:\nAlice\nBob\nCharlie";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
