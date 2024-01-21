import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int tamanio = scanner.nextInt();

        char[][] valores = new char[tamanio][tamanio];

        System.out.print("Ingrese un caracter para rellenar la matriz: ");
        char caracter = scanner.next().charAt(0);

        
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                valores[i][j] = caracter;
            }
        }

        Triangulos triangulos = new Triangulos(valores);

        System.out.println("\nTriángulo a:");
        triangulos.imprimirTrianguloA();

        System.out.println("\nTriángulo b:");
        triangulos.imprimirTrianguloB();

        scanner.close();
    }
}



    

