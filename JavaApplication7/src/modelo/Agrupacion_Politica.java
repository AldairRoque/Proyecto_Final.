
package modelo;


public class Agrupacion_Politica {
    
    //variables
    private int codigo_agrupacion;
    private String tipo_agrupacion;
    private String nombre_agrupacion;
    
    //constructor
    public Agrupacion_Politica(int codigo_agrupacion, String tipo_agrupacion, String nombre_agrupacion) {
        this.codigo_agrupacion = codigo_agrupacion;
        this.tipo_agrupacion = tipo_agrupacion;
        this.nombre_agrupacion = nombre_agrupacion;
    }
    
    //get

    public int getCodigo_agrupacion() {
        return codigo_agrupacion;
    }

    public String getTipo_agrupacion() {
        return tipo_agrupacion;
    }

    public String getNombre_agrupacion() {
        return nombre_agrupacion;
    }
    
    //set

    public void setCodigo_agrupacion(int codigo_agrupacion) {
        this.codigo_agrupacion = codigo_agrupacion;
    }

    public void setTipo_agrupacion(String tipo_agrupacion) {
        this.tipo_agrupacion = tipo_agrupacion;
    }

    public void setNombre_agrupacion(String nombre_agrupacion) {
        this.nombre_agrupacion = nombre_agrupacion;
    }
    
    //metodo toString
    @Override
    public String toString() {
        return "Agrupacion_Politica{" + "codigo_agrupacion=" + codigo_agrupacion + ", tipo_agrupacion=" + tipo_agrupacion + ", nombre_agrupacion=" + nombre_agrupacion + '}';
    }
    
    
}

