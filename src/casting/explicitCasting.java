package casting;

public class explicitCasting {
    public static void main(String[] args) {
        //Explicit casting - also known as narrowing / down-casting

        int age = 25;
        byte b = (byte) age;

        System.out.println(b); //25

        //BUT we will lose data if bigger primitive holds a data that can not be stored in small one

        int num1 = 128;
        byte num2 = (byte) num1; // it seems ok to compiler

        System.out.println(num2);

    }
}
