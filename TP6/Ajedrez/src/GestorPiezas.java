import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;


public class GestorPiezas {

    public static void mostrarPiezasBD()
	{
		
		//Objeto para ejecutar la consulta en la base de datos
    	AccesoDatos accesoBD = null; //Driver Mannager
    	Connection con = null; //Establece la conexion con la base de dato
    	Statement sentencia =null; //Query
		ResultSet rs=null; //Resultado de la Query si devuelve algo 
		
		// Se crea la consulta usando lenguaje SQL Estandar y almacenando en la variable query
		String query = "select idPieza, \n" + //
                        "TP.DescripciondePieza as TipoPieza , \n" + //
                        "C.Descripcion as Color, \n" + //
                        "P.Descripcion as ResumenPieza, \n" + //
                        "Posicion, \n" + //
                        "Movimiento, \n" + //
                        "Comportamiento, \n" + //
                        "Velocidad \n" + //
                        "from Pieza P inner join tipopieza TP on P.idtipoPieza = TP.idtipoPieza\n" + //
                        "inner join Color C on P.idColor = C.idColor";
        //En este bloque se ejecutan las sentencias necesarias para acceder a la BD y obtener la informacion
        try {
        	// Instancio un objeto de acceso a datos
        	accesoBD = new AccesoDatos();
			
            //Obtener la conexion para poder generar la sentencia de consulta
            con = accesoBD.getConexion();
            sentencia = con.createStatement();
            //Ejecuta la consulta y almacena el resultado en rs

            rs  = sentencia.executeQuery(query);
            // Procesa el resultSet y muestra la informacion obtenida desde la BD
            while(rs.next()){
            	
                  int idPieza = rs.getInt("IDPIEZA");
            		System.out.println("Pieza Nro: " + String.valueOf(idPieza)
                    + ", Tipo: " + rs.getString("TipoPieza") + ", Color: " + rs.getString("Color")
                    + ", Movimiento: " + rs.getString("MOVIMIENTO")
                    + ", Comportamiento: " + rs.getString("COMPORTAMIENTO") + ", Velocidad: " + rs.getInt("VELOCIDAD"));   	            			
			}    
            
        } catch (SQLException e) {
            System.err.println("Error al CARGAR DATOS");
        }
       finally
        {
        	try
        	{
        		// Cierra el ResultSet
        		if (rs!= null) rs.close();
        		// Cierra la sentencia
        		if (sentencia!= null) sentencia.close();
        		// Cierra la conexion
        		if (con != null) con.close();
        		
        	}catch (SQLException e)
        	{
        		System.err.println("Error al cerrar conexion");
        	}
        }
	}

    public static void insertarPieza(Pieza pieza) {
    String sql = "INSERT INTO PIEZA (IDTIPOPIEZA, DESCRIPCION, MOVIMIENTO, COMPORTAMIENTO, IDCOLOR, VELOCIDAD, FECHA_CREACION) VALUES ( ?, ?, ?, ?, ?, ?,?)";
    
    try (
        Connection conexion = new AccesoDatos().getConexion();
         PreparedStatement stmt = conexion.prepareStatement(sql)) {
        
        LocalDate fecha=LocalDate.now();

        String piezaNombre= pieza.getClass().getSimpleName();
        String piezaColor= pieza.getColor();

        int idColor= Pieza.colorPieza.valueOf(piezaColor).getIdColorPieza();
        int idTipoPieza = Pieza.tipoPieza.valueOf(piezaNombre).getIdTipoPieza();

        // Asignar los parámetros en la consulta
        stmt.setInt(1, idTipoPieza);
        stmt.setString(2, pieza.getClass().getSimpleName()+" "+pieza.getColor());
        stmt.setString(3, pieza.getMovimiento());
        stmt.setString(4, pieza.getComportamiento());
        stmt.setInt(5, idColor);
        stmt.setInt(6,pieza.getVelocidad());
        stmt.setObject(7,fecha);

        stmt.executeUpdate();
        System.out.println("---PIEZA INSERTADA---\n");
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("---ERROR PIEZA NO INSERTADA---\n");
        }
    }
}
