public class FibonacciRecursivo {
    public int fibonacci(int n) {
        if (n == 0) return 0; 
        if (n == 1) return 1; 
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        FibonacciRecursivo fr = new FibonacciRecursivo();
        System.out.println("Serie Fibonacci con 10 términos:");
        for (int i = 0; i < 10; i++) {
            System.out.print(fr.fibonacci(i) + " ");
        }
    }
}
