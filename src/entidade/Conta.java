package entidade;

public class Conta {

    String titular;
    String numeroConta;
    float saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String depoisto(long valor) {
        float novoValor = getSaldo() + valor;
        setSaldo(novoValor);
        return "foi depositado " + valor;
    }

}
