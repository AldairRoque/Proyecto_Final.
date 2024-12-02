
package modelo;


public class Dato {
    private int ubigeo;
    private String departamento;
    private String provincia;
    private String distrito;
    private String tipo_eleccion;
    private int mesa;
    private String estado_mesa;
    private int ubicacion_en_cedula;
    private String tipo_agrupacion;
    private int codigo_agrupacion;
    private String agrupacion;
    private int votos_obtenidos;
    private int electores_habiles;
    private int votos_blancos;
    private int votos_nulos;
    private int votos_impugnados;

    public Dato(int ubigeo, String departamento, String provincia, String distrito, String tipo_eleccion, int mesa, String estado_mesa, int ubicacion_en_cedula, String tipo_agrupacion, int codigo_agrupacion, String agrupacion, int votos_obtenidos, int electores_habiles, int votos_blancos, int votos_nulos, int votos_impugnados) {
        this.ubigeo = ubigeo;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.tipo_eleccion = tipo_eleccion;
        this.mesa = mesa;
        this.estado_mesa = estado_mesa;
        this.ubicacion_en_cedula = ubicacion_en_cedula;
        this.tipo_agrupacion = tipo_agrupacion;
        this.codigo_agrupacion = codigo_agrupacion;
        this.agrupacion = agrupacion;
        this.votos_obtenidos = votos_obtenidos;
        this.electores_habiles = electores_habiles;
        this.votos_blancos = votos_blancos;
        this.votos_nulos = votos_nulos;
        this.votos_impugnados = votos_impugnados;
    }

    public Dato(String ubigeo, String departamento, String provincia, String distrito, String tipoEleccion, String mesa, String estadoMesa, String ubicacionEnCedula, String tipoAgrupacion, int codigoAgrupacion, String agrupacionPolitica, int votosObtenidos, int electoresHabiles, int votosBlancos, int votosNulos, int votosImpugnados) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //gett

    public int getUbigeo() {
        return ubigeo;
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

    public String getTipo_eleccion() {
        return tipo_eleccion;
    }

    public int getMesa() {
        return mesa;
    }

    public String getEstado_mesa() {
        return estado_mesa;
    }

    public int getUbicacion_en_cedula() {
        return ubicacion_en_cedula;
    }

    public String getTipo_agrupacion() {
        return tipo_agrupacion;
    }

    public int getCodigo_agrupacion() {
        return codigo_agrupacion;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public int getVotos_obtenidos() {
        return votos_obtenidos;
    }

    public int getElectores_habiles() {
        return electores_habiles;
    }

    public int getVotos_blancos() {
        return votos_blancos;
    }

    public int getVotos_nulos() {
        return votos_nulos;
    }

    public int getVotos_impugnados() {
        return votos_impugnados;
    }
    
    //sett

    public void setUbigeo(int ubigeo) {
        this.ubigeo = ubigeo;
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

    public void setTipo_eleccion(String tipo_eleccion) {
        this.tipo_eleccion = tipo_eleccion;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public void setEstado_mesa(String estado_mesa) {
        this.estado_mesa = estado_mesa;
    }

    public void setUbicacion_en_cedula(int ubicacion_en_cedula) {
        this.ubicacion_en_cedula = ubicacion_en_cedula;
    }

    public void setTipo_agrupacion(String tipo_agrupacion) {
        this.tipo_agrupacion = tipo_agrupacion;
    }

    public void setCodigo_agrupacion(int codigo_agrupacion) {
        this.codigo_agrupacion = codigo_agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

    public void setVotos_obtenidos(int votos_obtenidos) {
        this.votos_obtenidos = votos_obtenidos;
    }

    public void setElectores_habiles(int electores_habiles) {
        this.electores_habiles = electores_habiles;
    }

    public void setVotos_blancos(int votos_blancos) {
        this.votos_blancos = votos_blancos;
    }

    public void setVotos_nulos(int votos_nulos) {
        this.votos_nulos = votos_nulos;
    }

    public void setVotos_impugnados(int votos_impugnados) {
        this.votos_impugnados = votos_impugnados;
    }

    @Override
    public String toString() {
        return "Dato{" + "ubigeo=" + ubigeo + ", departamento=" + departamento + ", provincia=" + provincia + ", distrito=" + distrito + ", tipo_eleccion=" + tipo_eleccion + ", mesa=" + mesa + ", estado_mesa=" + estado_mesa + ", ubicacion_en_cedula=" + ubicacion_en_cedula + ", tipo_agrupacion=" + tipo_agrupacion + ", codigo_agrupacion=" + codigo_agrupacion + ", agrupacion=" + agrupacion + ", votos_obtenidos=" + votos_obtenidos + ", electores_habiles=" + electores_habiles + ", votos_blancos=" + votos_blancos + ", votos_nulos=" + votos_nulos + ", votos_impugnados=" + votos_impugnados + '}';
    }
    
    
}
