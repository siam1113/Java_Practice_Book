import java.util.Scanner;

public class PracticeFour {
    public static void main(String[] args){
        var maxNumber =0;
        var minNumber = 0;

        Scanner input = new Scanner(System.in);

        for(int i=0; i < 5; i++){
            int number = input.nextInt();

            maxNumber = Math.max(maxNumber, number);
            if(i == 0){
                minNumber = Math.min(number, number);
            }else{
                minNumber = Math.min(minNumber, number);
            }
            
        }
        input.close();

        System.out.print("Max Numebr : " + maxNumber);
        System.out.print("\nMin Numebr : " + minNumber + "\n");
    }
}
