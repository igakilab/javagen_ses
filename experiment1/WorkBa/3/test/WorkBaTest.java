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
        input = "Alice\nBob\nCarol\nexit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkBa.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "メンバー名を入力してください（\"exit\"で終了）: メンバー名を入力してください（\"exit\"で終了）: メンバー名を入力してください（\"exit\"で終了）: メンバー名を入力してください（\"exit\"で終了）: \n部活動のメンバー一覧:\nAlice\nBob\nCarol";
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
        input = "David\nEmily\nFrank\nGeorge\nexit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkBa.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "メンバー名を入力してください（\"exit\"で終了）: メンバー名を入力してください（\"exit\"で終了）: メンバー名を入力してください（\"exit\"で終了）: メンバー名を入力してください（\"exit\"で終了）: メンバー名を入力してください（\"exit\"で終了）: \n部活動のメンバー一覧:\nDavid\nEmily\nFrank\nGeorge";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
