public class PotenciaRecursiva {
    public int potencia(int base, int exponente) {
        if (exponente == 0) return 1; 
        return base * potencia(base, exponente - 1); 
    }

    public static void main(String[] args) {
        PotenciaRecursiva pr = new PotenciaRecursiva();
        System.out.println("2^5 = " + pr.potencia(2, 5));
    }
}

