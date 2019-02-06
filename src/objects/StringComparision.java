package objects;

public class StringComparision {
    public static void main(String[] args) {
        String s1 = new String("Hello World");
        String s2 = new String("Hello World");
        String s3 = s1;
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());


        System.out.println("s1==s2: "+(s1 == s2));
        System.out.println("s1.equals(s2): "+s1.equals(s2));
        System.out.println("s3==s1: "+(s3 == s1));
        System.out.println("s1.equals(s2): "+s1.equals(s3));
    }
}


