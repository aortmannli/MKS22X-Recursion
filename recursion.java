public class recursion{
  public static void main(String[] args){
    //testing sqr root
		System.out.println("value:"+ 7 + "     square root:"+ sqrt(7,0.0001));
    System.out.println("value:"+ 2 + "     square root:"+ sqrt(2,0.0001));
    System.out.println("value:"+ 4 + "     square root:"+ sqrt(4,0.0001));
    System.out.println("value:"+ 0.5 + "     square root:"+ sqrt(0.5,0.0001));
    System.out.println("value:"+ 0.1 + "     square root:"+ sqrt(0.1,0.0001));


    //testing fib
    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(10));
    System.out.println(fib(12));
    System.out.println(fib(89));

    //testing makeAllSums
    /*System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();*/
  	}
  /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

  */

  public static double sqrt(double n, double tolerance) {
    if (n < 0) throw new IllegalArgumentException(n+" is negative.");
    return sqrtN(n, n/2, tolerance);
  }


	public static double sqrtN(double n, double guess, double tolerance) {
		if(pError(guess*guess,n) < tolerance){
			return guess;
		}else{
			guess = ((n/guess) + guess) / 2;
			return (sqrtN(n, tolerance, guess));
		}

  }

	public static double pError(double g, double a){
		return Math.abs(((g-a)/a)*100);
	}

  /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      if (n < 0) throw new IllegalArgumentException(n+" is negative.");
      if (n == 0) return 0;
      return fibT(0, 1, n);
    }

    public static int fibT(int a, int b, int n){
      if (n == 0) return a;
      return fibT(b, a+b, n-1);
    }


    public static ArrayList<Integer> makeAllSums(int n){
      if (n < 0) throw new IllegalArgumentException(n+" is negative.");
      ArrayList<Integer> current = new ArrayList<Integer>();

    }

    public static ArrayList<Integer> makeAllSumsHelp(int n, int sum, ArrayList<Integer> totals){
      if (n == 0) return totals.add(sum);
    }
}
