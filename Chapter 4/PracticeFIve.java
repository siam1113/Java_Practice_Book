import java.util.Scanner;

public class PracticeFIve {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totalPrice = 0;
    
        System.out.println("How many products did you buy ? \n-");
        int totalProd = input.nextInt();

        for(int i = 0; i < totalProd; i++){
            System.out.print("What's the price of each product ? \n Product " + (i + 1) + " : ");
            int price = input.nextInt();
            totalPrice += price;
        }

        System.out.print("Total price : " + totalPrice + "$\n");

        System.out.print("Make the payment : \n Pay->");
        while(true){
            int payment = input.nextInt();
            if(payment == totalPrice){
                System.out.print("Thanks for the payment , Have nice day !");
                break;
            } 
            if(payment < totalPrice){
                System.out.print("You have pay more : " + (totalPrice - payment) + "$\n Pay->");
                totalPrice -= payment;
            } else if(payment > totalPrice){
                System.out.print("Here's your change of: " + (payment - totalPrice) + "$\n");
                break;
            }
        }

    }
}
