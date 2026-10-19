public class Alfil extends Pieza{

    public Alfil(String color, String comportamiento, String movimiento, int velocidad) {
        super(color, comportamiento, movimiento, velocidad);
    }

    public Alfil(){
        
    }
    @Override 
    public void mover(){
        System.out.println("Oblicuo");
    }

    @Override 
    public void CrearPieza(Pieza arrAlfilN[], Pieza arrAlfilB[]){

        for(int i=0; i<2 ;i++ ){
            arrAlfilN[i]=new Alfil("Negro","Sesgo","Oblicuo",4);
            arrAlfilB[i]=new Alfil("Blanco","Sesgo","Oblicuo",4);
        }


    }
}