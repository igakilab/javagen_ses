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
        input = "Alice\n25\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB8.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "新しいPersonオブジェクトを作成します。名前を入力してください:\n年齢を入力してください:\n新しいPersonオブジェクトをリストに追加しました。\n現在のPersonリスト:\nAlice (25歳)";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
