import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB6Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "生徒の名前を入力してください:\nAlice\n生徒の成績を入力してください:\n85\n生徒の名前を入力してください:\nBob\n生徒の成績を入力してください:\n90\n生徒の名前を入力してください:\nCathy\n生徒の成績を入力してください:\n75\n生徒の名前を入力してください:\nDavid\n生徒の成績を入力してください:\n82\n生徒の名前を入力してください:\nElsa\n生徒の成績を入力してください:\n78\n生徒の名前を入力してください:\nFrank\n生徒の成績を入力してください:\n93\n生徒の名前を入力してください:\nGrace\n生徒の成績を入力してください:\n87\n生徒の名前を入力してください:\nHarry\n生徒の成績を入力してください:\n79\n生徒の名前を入力してください:\nIrene\n生徒の成績を入力してください:\n91\n生徒の名前を入力してください:\nJack\n生徒の成績を入力してください:\n84\n\n生徒名: Alice, 成績: 85\n生徒名: Bob, 成績: 90\n生徒名: Cathy, 成績: 75\n生徒名: David, 成績: 82\n生徒名: Elsa, 成績: 78\n生徒名: Frank, 成績: 93\n生徒名: Grace, 成績: 87\n生徒名: Harry, 成績: 79\n生徒名: Irene, 成績: 91\n生徒名: Jack, 成績: 84";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
