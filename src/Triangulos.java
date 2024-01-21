public class Triangulos {
    private char[][] matriz;

    public Triangulos(char[][] matriz) {
        this.matriz = matriz;
    }

    public void imprimirTrianguloA() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirTrianguloB() {
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}