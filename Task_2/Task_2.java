package Task_2;

import java.util.Scanner;

public class Task_2 {


    public static void main(String[] args) {
        UXhelper ux = new UXhelper();

        Scanner sc = new Scanner(System.in);
        System.out.println(ux.askName);
        String studentName =  sc.nextLine();

        Strudent student = new Strudent(studentName);

        System.out.println(ux.askNumberofSub);
        int subcount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<subcount; i++){
            System.out.println(ux.asknameofSubject + (i+1)+ "");
            String subjectName = sc.nextLine();

            int marks;
            while(true){
                System.out.println(ux.markEach + subjectName + ux.condition);
                marks = sc.nextInt();
                sc.nextLine();
                if(marks>= 0 && marks <= 100){
                    break;
                }
                System.out.println(ux.invalidMarkInput);

            }

        }
    }
}
