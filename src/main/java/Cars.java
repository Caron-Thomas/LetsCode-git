public class Cars {

    private String modelo;
    private int anoFabricacao;
    private boolean lataVelha;

    public Cars(String modelo, int anoFabricacao, boolean lataVelha) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.lataVelha = lataVelha;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public boolean isLataVelha() {
        return lataVelha;
    }

    public void setLataVelha(boolean lataVelha) {
        this.lataVelha = lataVelha;
    }
}
