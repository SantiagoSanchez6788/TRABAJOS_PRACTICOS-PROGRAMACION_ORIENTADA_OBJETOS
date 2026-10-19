public abstract class Pieza {
    private String color;
    private String comportamiento;
    private int velocidad;
    private String movimiento;
    
    public Pieza(String color, String comportamiento, String movimiento,int velocidad) {
        this.color = color;
        this.comportamiento = comportamiento;
        this.movimiento = movimiento;
        this.velocidad= velocidad;
    }

    public Pieza() {
    }

    public enum tipoPieza {
        Reina(1),
        Rey(2),
        Torre(3),
        Alfil(4),
        Caballo(5),
        Peon(6);
        
        private int idTipoPieza;

        private tipoPieza(int idTipoPieza) {
            this.idTipoPieza = idTipoPieza;
        }

         public int getIdTipoPieza() {
            return idTipoPieza;
        }

    }

    public abstract void mover();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }



    public abstract void CrearPieza(Pieza arr1[],Pieza arr2[]);

    @Override
        public String toString() {
    return getClass().getSimpleName()+" \nColor=" + color + "\nComportamiento=" + comportamiento +"\nMovimiento=" + movimiento+ "\nVelocida=" + velocidad;
    }

}