
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    private String titulo;
    private int anoCreacion;
    private int duracion;
    private Calidad calidad;

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String titulo, int anoCreacion, int duracion, Calidad calidad)
    {
        this.titulo = titulo;
        this.anoCreacion = anoCreacion;
        this.duracion = duracion;
        this.calidad = calidad;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getTitulo()
    {
        return titulo;
    }
    public int getAno()
    {
        return anoCreacion;
    }
    public int getDuracion()
    {
        return duracion;
    }
    public String getCalidad()
    {
        String cadenaADevolver = "";
        switch(calidad)
        {
            case FullHD:
            cadenaADevolver = "FullHD";
            break;
            case HD :
            cadenaADevolver = "HD";
            break;
        }
        return cadenaADevolver;
    }
}
