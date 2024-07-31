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
        input = "りんご\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkBa.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "フルーツを追加します。追加する果物の名前を入力してください。\nフルーツの在庫を確認します。\n在庫にりんごが1個あります。\nスキャナーをクローズします。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
