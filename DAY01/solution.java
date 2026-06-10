import java.util.*;

class solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int x = sc.nextInt();
    System.out.println(sumOfNaturals(x));
    sc.close();
  }

  public static int sumOfNaturals(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    return sum;
  }
}