import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;
        while(counter<=5){
            System.out.println("Enter Number #"+counter);
          try{  String n = scanner.nextLine();
            //int i = Integer.parseInt(n);
              double i = Double.parseDouble(n);
            sum+=i;
            counter++;}catch (NumberFormatException BadUserData){
              System.out.println("Invalid Value Try Again ");
          }
        }
        System.out.println("Your Total Sum is equal to : "+sum);
    }
}
