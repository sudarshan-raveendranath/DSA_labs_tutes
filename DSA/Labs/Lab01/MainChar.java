import java.util.Scanner;

public class MainChar {
    public static void main(String[] args) {
        System.out.println("enter your expression-");
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();


        boolean result = StackChar.validExpression(expression);

        if(result == false) {
            System.out.println("expression is not valid");
        }else {
            System.out.println("exression is valid");
        }





    }
}

