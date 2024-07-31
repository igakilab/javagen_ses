import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        ArrayList<EmployeeB6> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("従業員の勤務状況を入力してください。入力が終わったら\"end\"を入力してください。");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            employees.add(new EmployeeB6(input));
        }
        
        System.out.println("\n従業員の勤務状況一覧:");
        for (int i = 0; i < employees.size(); i++) {
            EmployeeB6 employee = employees.get(i);
            System.out.printf("従業員%d: %s%n", i+1, employee.getStatus());
        }
        
        sc.close();
    }
}