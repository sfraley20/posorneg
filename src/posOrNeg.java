import java.util.Scanner;

public class posOrNeg {
    public static void main(String[] args) {
        String welcomeMessage = "Please enter a number";
        System.out.println(welcomeMessage);

        Scanner scanner = new Scanner(System.in);
        String posMessage = "";
        String negMessage = "";
        int number = scanner.nextInt();

        if (number >= 0) {
            if (number ==0){
                posMessage= "The number is exactly 0";
            }
            else {
                posMessage = "positive";
            }
            if (number <= 0){
                if (number == 0){
                    posMessage= "The number is exactly 0";
                }
                else {
                    negMessage= "negative";
                }
            }
        }
        System.out.println(posMessage);

    }
    }
