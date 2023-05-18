package trabpoo2;

public abstract class Conta {

    private int agencia;
    private String tipoConta;
    private double saldo;
    private double saldoInicial;
    static double juros = 0.02;

    public void dadosBancariosIniciais(int agencia, String tipoConta, double saldoInicial) {
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.saldoInicial = saldoInicial;
        this.saldo = saldoInicial;
    }

    public void saque(double sacar) {
        if (sacar > 0) {
            this.saldo -= sacar;
        }
    }

    public void deposito(double depositar) {
        if (depositar > 0) {
            this.saldo += depositar;
        }
    }

    public double saldoAtual() {
        return this.saldo + this.saldo * juros;
    }

    public String exibeDadosBancariosIniciais() {
        return "Para sua conta como " + this.tipoConta + " sua agência é " + this.agencia + " e seu saldo inicial foi de R$" + this.saldoInicial;
    }

    public abstract void encerramentoConta();
}
