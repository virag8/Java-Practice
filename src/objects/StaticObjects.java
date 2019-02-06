package objects;

public class StaticObjects {
    public StaticObjects() {
       // this(1);
        System.out.println("in default constructor");

    }

    public StaticObjects(int num) {
        this();
        System.out.println("in constructor num: "+num);
    }

    static  {
        System.out.println("in static");
    }
    public static void main(String[] args) {
        StaticObjects staticObjects = new StaticObjects(1);
    }
}
