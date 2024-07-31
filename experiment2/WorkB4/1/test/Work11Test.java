import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Work11Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Work11.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "動物の名前を入力してください: cat\n動物の名前を入力してください: dog\n動物の名前を入力してください: rabbit\n動物の名前を入力してください: rabbit\n動物の名前を入力してください: tiger\n入力された動物の名前: cat dog rabbit rabbit tiger\n削除する動物の名前を入力してください: rabbit\nrabbit を削除しました。\n更新後の動物の名前: cat dog rabbit tiger";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
