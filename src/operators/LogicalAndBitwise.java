package operators;

public class LogicalAndBitwise {
    public static void main(String[] args) {

        intExample1();
    }
    public static void intExample1(){
        int a=20;
        int b=30;
        int result = a/b;
        System.out.println(a/b);
    }
    public static void floatExample1(){
        float myNum = -127;
        System.out.println(myNum);
        float a=2.2f;

        System.out.println(a);

    }

    public static void shortbyteExample1(){
        byte myNum = -127;
        System.out.println(myNum);
        byte a=127;
        byte b=127;
        byte result = (byte)(a+b);
        System.out.println(result);

    }
    public static void unaryExample(){
        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void unaryExample1(){
        int a=10;
        int b=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
        System.out.println(!!c);//false (opposite of boolean value)
        System.out.println(!!d);//true
    }
    public static void logicalExample1(){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a++<c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b&a++<c);//false && true = false
        System.out.println(a);//11 because second condition is checked
    }

    public static void logicalExample2(){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a>b||a<c);//true || true = true
        System.out.println(a>b|a<c);//true | true = true
//|| vs |
        System.out.println(a>b||a++<c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a>b|a++<c);//true | true = true
        System.out.println(a);//11 because second condition is checked
    }

    public static void ternaryExample1(){
        int a=2;
        int b=5;
        int min=(a<b)?a:++b;
        System.out.println(min);
        System.out.println(b);
    }


}
