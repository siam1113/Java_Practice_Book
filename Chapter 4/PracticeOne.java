public class PracticeOne {

    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};

        for(int i=0; i < 8; i++)
        {
            for(int j=0; j <= i; j++)
            {
                System.out.print(letters[i]);
            }
            System.out.print("\n");
        }
    }
}