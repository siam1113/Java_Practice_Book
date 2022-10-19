public class PracticeThree {
    public static void main(String[] args){
        int l = 0;

        for(int i = 6; i > 0; i--){
            if(i < 6){
                for(int k = 0; k < l; k++){
                    System.out.print(".");
                }
            }
            
            for(int j = 0; j < i; j++){       
                System.out.print("*");
            }

            System.out.print("\n");
            l++;
        }
    }
}
