import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkBaTest {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "Java入門書\n山田太郎\n2500\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkBa.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "書籍情報を登録します。\n書籍のタイトルを入力してください: 書籍の著者を入力してください: 書籍の価格を入力してください: \n在庫リスト:\nタイトル: Java入門書, 著者: 山田太郎, 価格: 2500円";
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
        input = "Pythonプログラミング\n佐藤花子\n1800\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkBa.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "書籍情報を登録します。\n書籍のタイトルを入力してください: 書籍の著者を入力してください: 書籍の価格を入力してください: \n在庫リスト:\nタイトル: Pythonプログラミング, 著者: 佐藤花子, 価格: 1800円";
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
        input = "SQL基礎教本\n鈴木次郎\n3000\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkBa.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "書籍情報を登録します。\n書籍のタイトルを入力してください: 書籍の著者を入力してください: 書籍の価格を入力してください: \n在庫リスト:\nタイトル: SQL基礎教本, 著者: 鈴木次郎, 価格: 3000円";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
