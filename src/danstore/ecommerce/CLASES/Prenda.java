package danstore.ecommerce.CLASES;

/**
 *
 * @author 
 */
public class Prenda {
    
    private int id;
    private String nombre;
    private double precio;
    private int talla;
    private String color;
    private int stock;
    
    public Prenda()
    {
        
        this.nombre = "";
        this.color = "";
        
    }

    public Prenda(int id, String nombre, double precio, int talla, String color, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
        this.color = color;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    
    
    
    
    
    
    
    
}
