import java.util.ArrayList;
import java.util.Scanner;

public class WorkB9 {
    
    public static void main(String[] args) {
        ArrayList<Class> classes = new ArrayList<Class>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("学校のクラス別に生徒の出欠を管理します。");
        System.out.println("クラス数を入力してください：");
        int numClasses = Integer.parseInt(sc.nextLine());
        
        for(int i=0; i<numClasses; i++) {
            System.out.print("クラス" + (i+1) + "のクラス名を入力してください：");
            String className = sc.nextLine();
            
            Class newClass = new Class(className);
            classes.add(newClass);
        }
        
        System.out.println("各クラスの生徒の出席簿を入力してください。");
        
        for(Class c : classes) {
            System.out.println(c.getClassName() + "の生徒の出欠を入力してください。(出席/欠席)");
            for(int i=0; i<c.getNumStudents(); i++) {
                System.out.print("生徒" + (i+1) + "：");
                String attendance = sc.nextLine().toLowerCase();
                if(attendance.equals("出席")) {
                    c.addAttendance(true);
                } else {
                    c.addAttendance(false);
                }
            }
        }
        
        System.out.println("各クラスの出欠状況を表示します。");
        
        for(Class c : classes) {
            System.out.println(c.getClassName() + "の出欠状況：");
            c.printAttendance();
        }
        
        sc.close();
    }
}