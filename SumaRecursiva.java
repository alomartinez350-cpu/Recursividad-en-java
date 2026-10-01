public class SumaRecursiva {
    public int suma(int n) {
        if (n == 0) return 0; 
        return n + suma(n - 1); 
    }

    public static void main(String[] args) {
        SumaRecursiva sr = new SumaRecursiva();
        System.out.println("Suma de 1 a 5: " + sr.suma(5));
    }
}
