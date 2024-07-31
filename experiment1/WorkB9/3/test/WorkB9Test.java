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
        input = "Apple\n-5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB9.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "現在の商品在庫状況:\nApple - 在庫: 10個\nBanana - 在庫: 20個\nOrange - 在庫: 15個\n商品の在庫を更新します。\n更新したい商品名を入力してください: 追加・減少させる数量を入力してください: 更新後の商品在庫状況:\nApple - 在庫: 5個\nBanana - 在庫: 20個\nOrange - 在庫: 15個";
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
        input = "Grape\n30\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB9.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "現在の商品在庫状況:\nApple - 在庫: 10個\nBanana - 在庫: 20個\nOrange - 在庫: 15個\n商品の在庫を更新します。\n更新したい商品名を入力してください: 追加・減少させる数量を入力してください: 該当する商品が見つかりませんでした\n更新後の商品在庫状況:\nApple - 在庫: 10個\nBanana - 在庫: 20個\nOrange - 在庫: 15個";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
