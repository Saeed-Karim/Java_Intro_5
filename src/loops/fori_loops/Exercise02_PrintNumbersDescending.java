package loops.fori_loops;

public class Exercise02_PrintNumbersDescending {
    public static void main(String[] args) {

        /*
        Write a Java program to print numbers backward starting from 100 to 0 (100 and 0 are included)

        Expected output:
        100
        99
        98
        .
        .
        .
        2
        1
        0
         */
        for(int g = 100; g >= 0; g--){
            System.out.println(g);
        }
    }
}
