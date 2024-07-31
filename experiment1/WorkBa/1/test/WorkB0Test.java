import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB0Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB0.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生のデータを入力してください（名前 年齢）\n入力が終わったら end と入力してください\nAlice 20\nBob 22\nCharlie 21\nend\n入力された学生データ:\nStudent{name='Alice', age=20}\nStudent{name='Bob', age=22}\nStudent{name='Charlie', age=21}";
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
        WorkB0.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生のデータを入力してください（名前 年齢）\n入力が終わったら end と入力してください\nDavid 25\nEve 23\nFrank 24\nGrace 22\nend\n入力された学生データ:\nStudent{name='David', age=25}\nStudent{name='Eve', age=23}\nStudent{name='Frank', age=24}\nStudent{name='Grace', age=22}";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }

    @Test
    public void mainTest3() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB0.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生のデータを入力してください（名前 年齢）\n入力が終わったら end と入力してください\nHenry 19\nIvy 20\nJack 21\nKate 22\nLiam 23\nend\n入力された学生データ:\nStudent{name='Henry', age=19}\nStudent{name='Ivy', age=20}\nStudent{name='Jack', age=21}\nStudent{name='Kate', age=22}\nStudent{name='Liam', age=23}";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
