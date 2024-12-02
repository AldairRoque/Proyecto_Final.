
package modelo;


public class Resultado_Eleccion {
    private String agrupacion;
    private int votos_obtenidos;
    private int electores_habiles;
    private int votos_blancos;
    private int votos_nulos;
    private int votos_impugnados;

    public Resultado_Eleccion(String agrupacion, int votos_obtenidos, int electores_habiles, int votos_blancos, int votos_nulos, int votos_impugnados) {
        this.agrupacion = agrupacion;
        this.votos_obtenidos = votos_obtenidos;
        this.electores_habiles = electores_habiles;
        this.votos_blancos = votos_blancos;
        this.votos_nulos = votos_nulos;
        this.votos_impugnados = votos_impugnados;
    }
    
    //get

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

    public void sumarVotos(int votos) {
        this.votos_obtenidos += votos;
    }
    public void sumarElectoreshabiles(int Electores){
        this.electores_habiles += Electores;

    }
    public void sumarVotosBlancos(int votosBlancos){
        this.votos_blancos += votosBlancos;
    }
    public void sumarVotosNulos(int votosNulos){
        this.votos_nulos += votosNulos;
    }
    public void sumarVotosImpugnados(int votosImpugnados){
        this.votos_impugnados += votosImpugnados;
    }

    @Override
    public String toString() {
        return "Resultado_Eleccion{" + "agrupacion=" + agrupacion + ", votos_obtenidos=" + votos_obtenidos + ", electores_habiles=" + electores_habiles + ", votos_blancos=" + votos_blancos + ", votos_nulos=" + votos_nulos + ", votos_impugnados=" + votos_impugnados + '}';
    }
    
    
}
