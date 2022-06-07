public class Cars {

    private String modelo;
    private int anoFabricacao;
    private boolean bucha;

    public Cars(String modelo, int anoFabricacao, boolean bucha){
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.bucha = bucha;
    }

    public Cars(){};

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public boolean getBucha(){
        return bucha;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setBucha(boolean bucha) {
        this.bucha = bucha;
    }
}
