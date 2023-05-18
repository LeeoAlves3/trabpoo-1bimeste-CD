package trabpoo2;

public class Run {
    public static void main(String[] args) {

        Conta[] contas = new Conta[5];
        
        // Cria 5 instâncias de ContaSimples com valores iniciais fixos
        for (int i = 0; i < contas.length; i++) {
            contas[i] = new ContaSimples();
            contas[i].dadosBancariosIniciais(1000 + i, "Pessoa Fisica", 1000.00);
        }
    
        // Altera a terceira conta para ser uma ContaEspecial com limite
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.dadosBancariosIniciais(2000, "Pessoa Juridica", 5000.00);
        contaEspecial.setLimite(2000.00);
        contas[2] = contaEspecial;
    
        for (int i = 0; i < contas.length; i++) {
            System.out.println(contas[i].exibeDadosBancariosIniciais());
            for (int j = 1; j <= 5; j++) {
                contas[i].deposito(100.00);
                System.out.println("Depósito " + j + " na conta " + (i + 1) + ": R$ 100,00" + " no dia: 0" + j + "/04/2023");
                contas[i].saque(50.00);
                System.out.println("Saque " + j + " na conta " + (i + 1) + ": R$ 50,00" + " no dia: 0" + j + "/04/2023");
                double saldoAtual = contas[i].saldoAtual();
                System.out.println("Seu saldo no dia 0" + j + "/04/2023 " + "é: R$" + saldoAtual);
                System.out.println();
            }
            
            System.out.println();
            System.out.println("**********************************************************************************************");
        }
    }
}
