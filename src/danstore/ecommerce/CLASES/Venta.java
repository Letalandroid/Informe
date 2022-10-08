
package danstore.ecommerce.CLASES;

import java.util.Date;

/**
 *
 * @author 
 */
public class Venta {
    
    private double precioTotal;
    private Prenda prendas[];
    private Date fecha;
    private int ruc;
    private CLIENTE cliente;
    private String tiempo_entrega;
    private String tipo_moneda;
    private double igv;
    private double preciosubtotal;
    
    
    
    

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Prenda[] getPrendas() {
        return prendas;
    }

    public void setPrendas(Prenda[] prendas) {
        this.prendas = prendas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public CLIENTE getCliente() {
        return cliente;
    }

    public void setCliente(CLIENTE cliente) {
        this.cliente = cliente;
    }

    public String getTiempo_entrega() {
        return tiempo_entrega;
    }

    public void setTiempo_entrega(String tiempo_entrega) {
        this.tiempo_entrega = tiempo_entrega;
    }

    public String getTipo_moneda() {
        return tipo_moneda;
    }

    public void setTipo_moneda(String tipo_moneda) {
        this.tipo_moneda = tipo_moneda;
    }
    
    
    
    
    
    
    
    
}
