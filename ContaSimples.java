package trabpoo2;

public class ContaSimples extends Conta {


    public void encerramentoConta() {
        if (saldo == 0) {
            System.out.println("Conta especial encerrada.");
        } else {
            System.out.println("Não é possível encerrar a conta especial. Ela possui saldo.");
        }
    }
}
