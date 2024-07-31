public class WorkB1 {
  public static void main(String[] args) {
    // 社員の出勤状況配列
    boolean[] attendance = {true, false, true, false, true};
    
    // 欠勤者リストを保持するArrayList
    java.util.ArrayList<String> absentees = new java.util.ArrayList<>();

    // 欠勤者を検索してリストアップ
    for (int i = 0; i < attendance.length; i++) {
        if (!attendance[i]) {
            switch (i) {
                case 0:
                    absentees.add("社員A");
                    break;
                case 1:
                    absentees.add("社員B");
                    break;
                  case 2:
                    absentees.add("社員C");
                    break;
                  case 3:
                    absentees.add("社員D");
                    break;
                  case 4:
                    absentees.add("社員E");
                    break;
            }
        }
    }

    // 欠勤者リストを出力
    if (absentees.size() > 0) {
        System.out.println("今日欠勤した社員:");
        for (int i = 0; i < absentees.size(); i++) {
            System.out.println(absentees.get(i));
        }
    } else {
        System.out.println("今日は欠勤者はいません！");
    }
  }
}