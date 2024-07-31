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
        input = "Alice\n2000-01-01\nBob\n1995-03-15\nCharlie\n1987-09-20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB7.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "友達の名前を入力してください:\n友達の誕生日を入力してください:\n友達の名前を入力してください:\n友達の誕生日を入力してください:\n友達の名前を入力してください:\n友達の誕生日を入力してください:\n友達の誕生日リスト:\nAliceの誕生日: 2000-01-01\nBobの誕生日: 1995-03-15\nCharlieの誕生日: 1987-09-20";
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
        input = "Eve\n1998-07-31\nDavid\n2005-12-10\nFrank\n1989-04-26\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB7.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "友達の名前を入力してください:\n友達の誕生日を入力してください:\n友達の名前を入力してください:\n友達の誕生日を入力してください:\n友達の名前を入力してください:\n友達の誕生日を入力してください:\n友達の誕生日リスト:\nEveの誕生日: 1998-07-31\nDavidの誕生日: 2005-12-10\nFrankの誕生日: 1989-04-26";
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
        input = "Lily\n1976-02-14\nGeorge\n1983-10-04\nSusan\n1992-11-18\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB7.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "友達の名前を入力してください:\n友達の誕生日を入力してください:\n友達の名前を入力してください:\n友達の誕生日を入力してください:\n友達の名前を入力してください:\n友達の誕生日を入力してください:\n友達の誕生日リスト:\nLilyの誕生日: 1976-02-14\nGeorgeの誕生日: 1983-10-04\nSusanの誕生日: 1992-11-18";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
