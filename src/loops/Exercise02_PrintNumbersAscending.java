package loops;

public class Exercise02_PrintNumbersAscending {
    public static void main(String[] args) {


        System.out.println("Beginner way");

        for(int k = 1; k <=10; k++){
            if(k != 10) System.out.print(k + " - ");
            else System.out.println(k);
        }

        System.out.println("Proper way");

        String result = "";

        for (int i = 1; i <= 10 ; i++) {
            result += i  + " - ";
        }
        System.out.println(result.substring(0, result.length()-3));
    }
}
