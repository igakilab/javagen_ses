import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB2Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB2.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "1: プロフィール追加 / 2: 検索 / 3: 終了 > 1\n名前を入力してください: Alice\n年齢を入力してください: 30\n1: プロフィール追加 / 2: 検索 / 3: 終了 > 1\n名前を入力してください: Bob\n年齢を入力してください: 25\n1: プロフィール追加 / 2: 検索 / 3: 終了 > 2\n検索する名前を入力してください: Alice\n名前: Alice, 年齢: 30\n1: プロフィール追加 / 2: 検索 / 3: 終了 > 2\n検索する名前を入力してください: Charlie\n該当するプロフィールは見つかりませんでした。\n1: プロフィール追加 / 2: 検索 / 3: 終了 > 3";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
