package programs;

public class fibonacci {


    public static void main(String[] args) {
        recursiveFibonacci(0,1);
    }
        public static void Fibonacci(){
            int i = 0;
            int n = 5;
            int nextInt1 = 0;
            int nextInt2 = 1;
            for (int count = 1; count <= n; count++) {
                int sum = nextInt1 + nextInt2;
                System.out.print("nextInt1=" + nextInt1);
                System.out.print("nextInt2=" + nextInt2);
                System.out.println(sum);
                nextInt1 = nextInt2;
                nextInt2 = sum;

            }
        }
        public static void recursiveFibonacci(int nextnum1, int nextnum2){
        //if (nextnum1 <=1) System.out.println(nextnum1);
        if (nextnum2 < 50) {
                int sum = nextnum1 + nextnum2;
                //System.out.print("nextInt1="+nextInt1);
                //System.out.print("nextInt2="+nextInt2);
                System.out.println(sum);

                recursiveFibonacci(nextnum2, sum);
            }
        }

}
