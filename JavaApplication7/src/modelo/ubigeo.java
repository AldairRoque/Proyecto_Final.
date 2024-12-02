
package modelo;


public class ubigeo {
    
    private int id_ubigeo;
    private String departamento;
    private String provincia;
    private String distrito;

    public ubigeo(int id_ubigeo, String departamento, String provincia, String distrito) {
        this.id_ubigeo = id_ubigeo;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
    }
    
    //get

    public int getId_ubigeo() {
        return id_ubigeo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getDistrito() {
        return distrito;
    }
    
    //set

    public void setId_ubigeo(int id_ubigeo) {
        this.id_ubigeo = id_ubigeo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    @Override
    public String toString() {
        return "ubigeo{" + "id_ubigeo=" + id_ubigeo + ", departamento=" + departamento + ", provincia=" + provincia + ", distrito=" + distrito + '}';
    }
    
    
}

