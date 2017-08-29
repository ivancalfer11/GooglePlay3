
/**
 * Write a description of class Ebook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private String titulo;
    private int anoCreacion;
    private int numPaginas;
    private boolean ficcion;

    /**
     * Constructor for objects of class Ebook
     */
    public Libro(String titulo, int anoCreacion , int numPaginas, boolean ficcion)
    {
       this.titulo = titulo;
       this.anoCreacion = anoCreacion;
       this.numPaginas = numPaginas;
       this.ficcion = ficcion;
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
    public int getNumeroPaginas()
    {
        return numPaginas;
    }
    public boolean getFiccion()
    {
        return ficcion;
    }
}
