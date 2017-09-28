package ADOII;

/**
 *
 * @author Andreson
 */
public class TV {
    private int canal;
    private int volume;
    private boolean ligada;
    
    public TV(){
        ligada = false;
        canal = 2;
        volume = 10;
    }

    /**
     * @return the canal
     */
    public int getCanal() {
        return canal;
    }

    /**
     * @param canal the canal to set
     */
    public void setCanal(int canal) {
        this.canal = canal;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the ligada
     */
    public boolean isLigada() {
        return ligada;
    }

    /**
     * @param ligada the ligada to set
     */
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    /**
     * 
     */
    public void imorimirEstado(){
        if (ligada){
            System.out.println("TV Desligada");
        }
            System.out.println("TV Ligada");
    }
}
