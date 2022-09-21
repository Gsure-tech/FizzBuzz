import java.util.Scanner;

public class Main {
    // This is fizz buzz challenge using an if statement
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<5; i++){
        System.out.println("Enter a Number");
        int number = scanner.nextInt();
        if(number%5==0 && number%3==0){
            System.out.println("FIZZBUZZ");
        }
        else if(number%5==0){
            System.out.println("FIZZ");
        }else if(number % 3==0){
            System.out.println("BUZZ");
        }

    }
        int time =20;
        String result = (time < 10) ? "Good day ":"Good evening";
        System.out.println(result);
    }
}