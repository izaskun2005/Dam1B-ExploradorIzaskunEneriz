package Clases;
public class Mapa {
    private char[][] tablero; // Representación del mapa

    // Constructor
    public Mapa() {
        tablero = new char[6][20];
        inicializarMapa();
    }

    // Inicializar el mapa
    private void inicializarMapa() {
        // Llenar el mapa con espacios vacíos
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 20; j++) {
                tablero[i][j] = ' ';
            }
        }

        // Colocar al jugador y elementos
        tablero[0][0] = 'J'; // Posición inicial del jugador
        colocarElemento('E', 3); // Colocar 3 enemigos
        colocarElemento('T', 3); // Colocar 3 trampas
    }

    // Colocar un tipo de elemento en posiciones aleatorias
    private void colocarElemento(char tipo, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int fila, columna;
            do {
                fila = (int) (Math.random() * 6);
                columna = (int) (Math.random() * 20);
            } while (tablero[fila][columna] != ' '); // Asegurar que la posición esté vacía
            tablero[fila][columna] = tipo;
        }
    }

    // Mostrar el mapa (para depuración)
    public void mostrarMapa() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Getter para el tablero
    public char[][] getTablero() {
        return tablero;
    }
}

