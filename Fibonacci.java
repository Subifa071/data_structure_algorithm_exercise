public class Fibonacci {
public int CalculateFibonacci(int n)
{
int n1=0, n2=1, temp;
for(int i=2; i<=n; i++) {
temp = n1 + n2;
n1 = n2;
n2 = temp;
}
return n2;
}
public static void main(String[] args) {
Fibonacci fib = new Fibonacci();
// System.out.println(fib.CalculateFibonacci(5));
System.out.println(fib.CalculateFibonacci(6));
// System.out.println(fib.CalculateFibonacci(7));
}
}
// The above solution has time complexity of O(n) but a constant space complexity of O(1).

