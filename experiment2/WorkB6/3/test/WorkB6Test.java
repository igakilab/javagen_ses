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
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "店舗の数を入力してください\n2\n店舗1の商品の種類を入力してください\nA\n店舗1の在庫数を入力してください\n50\n店舗1の価格を入力してください\n100\n店舗2の商品の種類を入力してください\nB\n店舗2の在庫数を入力してください\n30\n店舗2の価格を入力してください\n150\n\n在庫移動を行います。\n商品名を入力してください\nA\n移動元の店舗番号を入力してください\n1\n移動先の店舗番号を入力してください\n2\nAの在庫を店舗1から店舗2に移動しました。\n\n在庫を補充します。\n商品名を入力してください\nB\n補充する店舗番号を入力してください\n1\nBの在庫を店舗1で補充しました。\n\n店舗1:\n商品名: A, 在庫数: 30, 価格: 100\n店舗2:\n商品名: B, 在庫数: 60, 価格: 150";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
