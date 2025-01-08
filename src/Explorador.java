package Clases;
public class Explorador {
    // Atributos
    private String nombre;
    private int fila;
    private int columna;

    // Constantes
    private static final int ARRIBA = 1;
    private static final int ABAJO = 2;
    private static final int DERECHA = 3;
    private static final int IZQUIERDA = 4;
    private static final int MAX_FILA = 10; // Límite máximo de filas
    private static final int MAX_COLUMNA = 10; // Límite máximo de columnas

    // Constructor
    public Explorador(String nombre) {
        this.nombre = nombre;
        this.columna = 0; // Primera columna
        this.fila = new Random().nextInt(MAX_FILA); // Fila aleatoria
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    // Método para moverse
    public void moverse(int direccion) {
        switch (direccion) {
            case ARRIBA:
                if (this.fila > 0) {
                    this.fila--;
                }
                break;
            case ABAJO:
                if (this.fila < MAX_FILA - 1) {
                    this.fila++;
                }
                break;
            case DERECHA:
                if (this.columna < MAX_COLUMNA - 1) {
                    this.columna++;
                }
                break;
            case IZQUIERDA:
                if (this.columna > 0) {
                    this.columna--;
                }
                break;
            default:
                System.out.println("Dirección inválida");
        }
    }

    //método toString
    @Override
    public String toString() {
        return "Explorador{" +
                "nombre='" + nombre + '\'' +
                ", fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}


