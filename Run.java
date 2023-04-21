package trabpoo2;

public class Run {
    public static void main(String[] args) {

        Conta[] contas = new Conta[5];
        //cria 5 instancias da classe conta com valores iniciais chumbafos
        for (int i = 0; i < contas.length; i++) {
            contas[i] = new Conta();
            contas[i].dadosBancariosIniciais(1000+i, "Pessoa Fisica", 1000.00);
        }
    
        //percorre recursivamente todas as contas realizando os saques e depositos e exibe o saldo na tela || não sabia se podia usar o Date do Java e fiz Gambi na data
        for (int i = 0; i < contas.length; i++) {
            System.out.println(contas[i].exibeDadosBancariosIniciais());
            for (int j = 1; j <= 5; j++) {
                contas[i].deposito(100.00);
                System.out.println("Depósito " + j + " na conta " + (i+1) + ": R$ 100,00" + " no dia: 0" + j + "/04/2023");
                contas[i].saque(50.00);
                System.out.println("Saque " + j + " na conta " + (i+1) + ": R$ 50,00" + " no dia: 0" + j + "/04/2023");
                double saldoAtual = contas[i].saldoAtual();
                System.out.println("Seu saldo no dia 0" + j + "/04/2023 " + "é: R$" + saldoAtual);
                System.out.println();
            }
            
            System.out.println();
            System.out.println("**********************************************************************************************");
        }
    }
    
}
