package trabpoo2;

public class ContaEspecial extends Conta {

    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void encerrarConta() {
        if (saldo == 0) {
            System.out.println("Conta especial encerrada.");
        } else {
            System.out.println("Não é possível encerrar a conta especial. Ela possui saldo.");
        }
    }

}
