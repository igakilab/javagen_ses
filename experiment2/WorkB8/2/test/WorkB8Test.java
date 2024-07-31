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
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB8.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生の名前と科目の成績を入力してください（名前が\"End\"の場合、入力終了）\n名前: Alice\n成績: 95\n名前: Bob\n成績: 87\n名前: Charlie\n成績: 75\n名前: End\n\n入力された成績一覧:\nAlice: 95\nBob: 87\nCharlie: 75";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
