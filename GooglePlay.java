import java.util.ArrayList;
/**
 * Write a description of class Tienda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    // instance variables - replace the example below with your own
    private ArrayList<Producto> productos;
    private ArrayList<Usuario> usuarios;
    private int numUsuarios;
    private int numProductos;

    /**
     * Constructor for objects of class Tienda
     */
    public GooglePlay()
    {
        productos = new ArrayList<Producto>();
        usuarios = new ArrayList<Usuario>();
        numUsuarios = usuarios.size();
        numProductos = productos.size();
        

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addUsuario(Usuario user)
    {
        usuarios.add(user);
        numUsuarios++;
    }
    public void addProducto(Producto prod)
    {
        productos.add(prod);
        numProductos++;
    }
    public int getNumeroUsuarios()
    {

        return numUsuarios;
    }
    public int getNumeroProductos()
    {
         
        return numProductos;
    }
}
