package programs;

public class prime {
    public static void main(String[] args) {
        int num = 1231213444;
        boolean prime = true;
        for(int i = 2;i<num/2;i++)
        {
            if (num % i == 0) {
                System.out.println("i="+i);
                prime = false;
                break;
            }
        }
        System.out.println(num+"="+(prime? "prime":"not prime"));
    }

}
