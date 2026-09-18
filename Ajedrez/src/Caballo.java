public class Caballo extends Pieza {

    public Caballo(String color, String comportamiento, String movimiento, int velocidad) {
        super(color, comportamiento, movimiento, velocidad);
    }

    public Caballo(){
        
    }
    @Override 
    public void mover(){
        System.out.println("....");
    }
    
    @Override 
    public void CrearPieza(Pieza arrCaballoN[], Pieza arrCaballoB[]){

        for(int i=0; i<2 ;i++ ){
            arrCaballoN[i]=new Caballo("Negro","Ligero","...",5);
            arrCaballoB[i]=new Caballo("Blanco","Ligero","...",5);
        }


    }
}
