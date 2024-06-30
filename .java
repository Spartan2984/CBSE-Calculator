import java.util.Scanner;

public class cbseCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your first name(only): ");
        Scanner s = new Scanner(System.in);
        String name= s.next();
        System.out.println("Enter your marks in Sub1(out of 100): ");
        int s1 = s.nextInt();
        System.out.println("Enter your marks in Sub2(out of 100): ");
        int s2 = s.nextInt();
        System.out.println("Enter your marks in Sub3(out of 100): ");
        int s3 = s.nextInt();
        System.out.println("Enter your marks in Sub4(out of 100): ");
        int s4 = s.nextInt();
        System.out.println("Enter your marks in Sub5(out of 100): ");
        int s5 = s.nextInt();
        int sum=s1+s2+s3+s4+s5;
        System.out.println("Your total marks is(out of 500): ");
        System.out.println(sum);
        float p = (sum)/5;
        System.out.println("Your percentage obtained is: ");
        System.out.println(p);
    }
}
