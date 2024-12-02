
package modelo;


public class Mesa_Electoral {
    private int id_mesa;
    private String tipo_eleccion;
    private String estado_mesa;
    private int ubicacion_en_cedula;

    public Mesa_Electoral(int id_mesa, String tipo_eleccion, String estado_mesa, int ubicacion_en_cedula) {
        this.id_mesa = id_mesa;
        this.tipo_eleccion = tipo_eleccion;
        this.estado_mesa = estado_mesa;
        this.ubicacion_en_cedula = ubicacion_en_cedula;
    }
    
    //get

    public int getId_mesa() {
        return id_mesa;
    }

    public String getTipo_eleccion() {
        return tipo_eleccion;
    }

    public String getEstado_mesa() {
        return estado_mesa;
    }

    public int getUbicacion_en_cedula() {
        return ubicacion_en_cedula;
    }
    
    //set

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public void setTipo_eleccion(String tipo_eleccion) {
        this.tipo_eleccion = tipo_eleccion;
    }

    public void setEstado_mesa(String estado_mesa) {
        this.estado_mesa = estado_mesa;
    }

    public void setUbicacion_en_cedula(int ubicacion_en_cedula) {
        this.ubicacion_en_cedula = ubicacion_en_cedula;
    }

    @Override
    public String toString() {
        return "Mesa_Electoral{" + "id_mesa=" + id_mesa + ", tipo_eleccion=" + tipo_eleccion + ", estado_mesa=" + estado_mesa + ", ubicacion_en_cedula=" + ubicacion_en_cedula + '}';
    }
    
    
    
}


