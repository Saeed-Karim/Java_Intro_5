package singleton;

public class Driver {

    private static Driver driver;

    private Driver() {}

    public static Driver getDriver() {
        if (driver == null) {
            driver = new Driver();
        }
        return driver;
    }


    public static void main(String[] args) {
        Driver d1 = getDriver();
        Driver d2 = getDriver();
        Driver d3 = getDriver();
        Driver d4 = getDriver();
        Driver d5 = getDriver();


        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }
}

