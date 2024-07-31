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
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB9.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "各店舗の在庫情報を入力してください。\n店舗名: Store A\n商品名: Item A\n在庫数: 50\n店舗名: Store B\n商品名: Item B\n在庫数: 30\n店舗名: Store C\n商品名: Item C\n在庫数: 100\nStore AのItem Aの在庫数: 50\nStore BのItem Bの在庫数: 30\nStore CのItem Cの在庫数: 100\n各店舗の売上データを入力してください。\nStore Aの売上: 20\nStore Bの売上: 10\nStore Cの売上: 30\n総売上額: 60\nStore AのItem Aの在庫数: 30\nStore BのItem Bの在庫数: 20\nStore CのItem Cの在庫数: 70";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
