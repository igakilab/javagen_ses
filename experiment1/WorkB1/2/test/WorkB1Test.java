import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB1Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "100\n200\n300\n-1\n20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB1.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "商品の価格を入力してください（終了する場合は負の数を入力）: 商品の価格を入力してください（終了する場合は負の数を入力）: 商品の価格を入力してください（終了する場合は負の数を入力）: 商品の価格を入力してください（終了する場合は負の数を入力）: 割引率を入力してください（0～100の間で入力）: 割引額一覧:\n商品1: 20\n商品2: 40\n商品3: 60";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
