package Task_2;

import java.util.Scanner;

public class Task_2 {


    public static void main(String[] args) {
        UXhelper ux = new UXhelper();
        System.out.println(ux.opening);
        Scanner sc = new Scanner(System.in);
        System.out.print(ux.askName);

        String studentName =  sc.nextLine();

        Strudent student = new Strudent(studentName);
        System.out.println(ux.line);
        System.out.print(ux.askNumberofSub);
        int subcount = sc.nextInt();
        System.out.println(ux.line);
        sc.nextLine();

        for (int i = 0; i<subcount; i++){
            System.out.print((i+1)+ux.asknameofSubject );
            String subjectName = sc.nextLine();

            int marks;
            while(true){
                System.out.print(ux.markEach + subjectName + ux.condition);
                marks = sc.nextInt();
                sc.nextLine();
                if(marks>= 0 && marks <= 100){
                    break;
                }

                System.out.println(ux.invalidMarkInput);

            }
            student.addSubject(subjectName, marks);

        }
        student.resultSys();
        sc.close();
    }
}
