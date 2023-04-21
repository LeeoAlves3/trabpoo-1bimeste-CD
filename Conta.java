package trabpoo2;

public class Conta {

    private int agencia;
    private String tipoConta;
    private double saldo;
    private double saldoInicial;
    static double juros = 0.02;

        //define os dados iniciais
        public void dadosBancariosIniciais (int agencia, String tipoConta, double saldoInicial) {
            this.agencia = agencia;
            this.tipoConta = tipoConta;
            this.saldoInicial = saldoInicial;
            this.saldo = saldoInicial;
        }

        //realiza o saque com validação de valor
        public void saque(double sacar) {
            if (sacar > 0) {
                this.saldo = this.saldo-sacar;
            }
        }

        //realiza deposito com validação de valor | não entendi o "bloquear deposito positivo" nos requisitos do moodle
        public void deposito(double depositar) {
            if (depositar > 0) {
                this.saldo = this.saldo+depositar;
            }
        }

        //calcula o saldo com 0.02 de juros
        public double saldoAtual () {
            return this.saldo + this.saldo*juros;
        }

        // retorna a string com os dados da conta
        public String exibeDadosBancariosIniciais () {
            return "Para sua conta como " +this.tipoConta+ " sua agência é " +this.agencia + " e seu saldo inicial foi de R$" + this.saldoInicial;
        }
}
