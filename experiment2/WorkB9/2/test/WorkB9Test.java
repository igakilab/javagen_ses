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
        String answer = "学校のクラス別に生徒の出欠を管理します。\nクラス数を入力してください：\n2\nクラス1のクラス名を入力してください：A班\nクラス2のクラス名を入力してください：B班\n各クラスの生徒の出席簿を入力してください。\nA班の生徒の出欠を入力してください。(出席/欠席)\n生徒1：出席\n生徒2：欠席\nB班の生徒の出欠を入力してください。(出席/欠席)\n生徒1：出席\n生徒2：出席\n各クラスの出欠状況を表示します。\nA班の出欠状況：\n出席：1\n欠席：1\nB班の出欠状況：\n出席：2\n欠席：0";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
