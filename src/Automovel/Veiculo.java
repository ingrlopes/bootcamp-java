package Automovel;

public abstract class Veiculo {

    private String placa;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String chassi) {
        this.placa = placa;
    }

    public abstract void ligar();
}