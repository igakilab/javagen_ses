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
        input = "apple\nbanana\norange\nexit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB7.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "商品名を入力してください（終了する場合はexitを入力）:\n商品名を入力してください（終了する場合はexitを入力）:\n商品名を入力してください（終了する場合はexitを入力）:\n商品名を入力してください（終了する場合はexitを入力）:\nカート内の商品一覧:\napple\nbanana\norange\n合計金額は 230 円です";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
