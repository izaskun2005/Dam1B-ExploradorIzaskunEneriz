package Clases;
public class Enemigo {
    private String nombre;
    private Posicion posicionActual;

    public Enemigo(String nombre, int filas) {
        this.nombre = nombre;

        int filaAleatoria = (int) (Math.random() * (filas - 1));
        this.posicionActual = new Posicion(0, filaAleatoria); // Primera columna, fila aleatoria
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void moverse(int direccion) {
        final int ARRIBA = 1;
        final int ABAJO = 2;
        final int DERECHA = 3;
        final int IZQUIERDA = 4;

        // Verificar si la dirección es válida
        if (direccion < ARRIBA || direccion > IZQUIERDA) {
            throw new RuntimeException("Dirección no válida");
        }

        // Calcular nueva posición
        int nuevaFila = this.posicionActual.getFila();
        int nuevaColumna = this.posicionActual.getColumna();

        switch (direccion) {
            case ARRIBA:
                nuevaFila--;
                break;
            case ABAJO:
                nuevaFila++;
                break;
            case DERECHA:
                nuevaColumna++;
                break;
            case IZQUIERDA:
                nuevaColumna--;
                break;
        }

        // Verificar si la nueva posición es válida
        if (nuevaFila >= 0 && nuevaFila < filas &&
                nuevaColumna >= 0 && nuevaColumna < columnas &&
                !hayEnemigoEnPosicion(nuevaFila, nuevaColumna) &&
                !hayTrampaEnPosicion(nuevaFila, nuevaColumna)) {

            this.posicionActual = new Posicion(nuevaFila, nuevaColumna);
        } else {
            System.out.println("No se puede mover a esa posición");
        }
    }


    private boolean hayEnemigoEnPosicion(int fila, int columna) {
        return false;
    }

    private boolean hayTrampaEnPosicion(int fila, int columna) {
        return false;
    }
}
