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
        input = "3 5 7 2 9 10 6 4 8 1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB8.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "10人の順位を入力してください。\n最下位の順位を削除しました。残りの順位は:\n3 5 7 2 9 10 6 4 8";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
