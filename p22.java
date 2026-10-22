class AccessExample {

    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;

    public void displayPrivate() {
        System.out.println("Private Variable: " + privateVar);
    }
}

public class p22 {
    public static void main(String[] args) {

        AccessExample obj = new AccessExample();

        System.out.println("Public Variable: " + obj.publicVar);

        // Private variable cannot be accessed directly
        // System.out.println(obj.privateVar); // Error

        obj.displayPrivate();

        System.out.println("Protected Variable: " + obj.protectedVar);

        System.out.println("Default Variable: " + obj.defaultVar);
    }
}