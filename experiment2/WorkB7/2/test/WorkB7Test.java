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
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB7.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生の氏名を入力してください: Alice\n学生の得点を入力してください: 85\n学生の氏名を入力してください: Bob\n学生の得点を入力してください: 73\n学生の氏名を入力してください: Carol\n学生の得点を入力してください: 90\n平均点: 82.67\n最高得点: 90";
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
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB7.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生の氏名を入力してください: Sam\n学生の得点を入力してください: 67\n学生の氏名を入力してください: Emily\n学生の得点を入力してください: 92\n学生の氏名を入力してください: Jack\n学生の得点を入力してください: 80\n平均点: 79.67\n最高得点: 92";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
