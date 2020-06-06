import java.util.Scanner;

public class IfElse2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Maths marks: ");
        int maths = scanner.nextInt();
        System.out.println("Please enter your English marks: ");
        int eng = scanner.nextInt();
        System.out.println("Please enter your Science marks: ");
        int sci = scanner.nextInt();
        int total = maths + eng + sci ;
        double percentage = total/3 ;
        System.out.println("Total marks = " +total);
        System.out.println("Percentage = " + percentage);
        if (percentage < 40) {
            System.out.println("Fail");
        }
        else if (percentage >= 40 && percentage < 50){
            System.out.println("C grade");
        }
        else if (percentage >= 50 && percentage < 70){
            System.out.println("B grade");
        }
        else if (percentage >= 70 && percentage < 100){
            System.out.println("A grade");
        } else {
            System.out.println("Invalid entry");
        }

    }
}
