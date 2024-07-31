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
        String answer = "図書館の本の貸出状況を管理します。\n本の情報を入力してください。\n書名を入力してください（終了する場合は\"exit\"を入力）: Java入門\n著者名を入力してください: Smith\n書名を入力してください（終了する場合は\"exit\"を入力）: Pythonプログラミング\n著者名を入力してください: Johnson\n書名を入力してください（終了する場合は\"exit\"を入力）: exit\n図書館に登録されている本は以下の通りです:\n書名: Java入門, 著者: Smith\n書名: Pythonプログラミング, 著者: Johnso";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
