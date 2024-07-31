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
        input = "3\nAlice\n25\nBob\n30\nClaire\n20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB8.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "何人の情報を登録しますか？\nPerson 1の名前を入力してください: Person 1の年齢を入力してください: Person 2の名前を入力してください: Person 2の年齢を入力してください: Person 3の名前を入力してください: Person 3の年齢を入力してください: 最年少のPerson:\n名前: Claire, 年齢: 20";
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
        input = "2\nDavid\n38\nEmily\n22\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB8.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "何人の情報を登録しますか？\nPerson 1の名前を入力してください: Person 1の年齢を入力してください: Person 2の名前を入力してください: Person 2の年齢を入力してください: 最年少のPerson:\n名前: Emily, 年齢: 22";
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
        input = "1\nFrank\n45\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB8.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "何人の情報を登録しますか？\nPerson 1の名前を入力してください: Person 1の年齢を入力してください: 最年少のPerson:\n名前: Frank, 年齢: 45";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
