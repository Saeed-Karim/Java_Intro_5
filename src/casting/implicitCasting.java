package casting;

public class implicitCasting {
    public static void main(String[] args) {

        //implicit casting - also known as widening / upcasting
        byte b = 127; // -128 - 127(byte range)

        int i = b;
        System.out.println(i); //127

        float f = 10.5F;
        double d = f;

        System.out.println(d); //10.5

    }

}
