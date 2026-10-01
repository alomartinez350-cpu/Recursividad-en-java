public class Reverso {
    public void imprimirReverso(String texto, int indice) {
        if (indice < 0) return; 
        System.out.print(texto.charAt(indice));
        imprimirReverso(texto, indice - 1); 
    }

    public static void main(String[] args) {
        Reverso reverso = new Reverso(); 
        String palabra = "Alondra";
        System.out.print("Reverso: ");
        reverso.imprimirReverso(palabra, palabra.length() - 1);
    }
}

