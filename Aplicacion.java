
/**
 * Write a description of class Aplicaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    // instance variables - replace the example below with your own
    private String nombre;
    private double tamanoApp;
    private Categoria categoria;

    /**
     * Constructor for objects of class Aplicaciones
     */
    public Aplicacion(String nombre, double tamanoApp , Categoria categoria)
    {
       this.nombre = nombre;
       this.tamanoApp = tamanoApp;
       this.categoria = categoria;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombre()
    {
        return nombre;
    }
    public double getTamanoEnMB()
    {
        return tamanoApp;
    }
    public String getCategoria()
    {
        String cadenaADevolver = " ";
        switch(categoria)
        {
            case JUEGOS:
            cadenaADevolver = "Juegos";
            break;
            case COMUNICACION:
            cadenaADevolver = "Comunicaciones";
            break;
            case MULTIMEDIA:
            cadenaADevolver = "Multimedia";
            break;
            case PRODUCTIVIDAD:
            cadenaADevolver = "Productividad";
            break;
        }
         return cadenaADevolver;
    }  
}

