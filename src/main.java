public class main {

    public static void main(String[] args) {

        Cliente diogo = new Cliente();
        diogo.setNome("Diogo");

        Conta contaC = new ContaCorrente(diogo);
        Conta contaP = new ContaPoupanca(diogo);

//        Depositando na cc
        contaC.depositar(100);

//        Sacando o valor na conta
        contaC.sacar(50);
//        Transferindo para cp
//        contaC.trasnferir(200, contaP);

        contaC.imprimirExtrato();
        contaP.imprimirExtrato();


    }
}
