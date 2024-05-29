
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta ccVenilton = new ContaCorrente(venilton);
		Conta poupancaVenilton = new ContaPoupanca(venilton);

		ccVenilton.depositar(100);
		ccVenilton.transferir(100, poupancaVenilton);
		
		ccVenilton.imprimirExtrato();
		poupancaVenilton.imprimirExtrato();

        Cliente robson = new Cliente();
		venilton.setNome("Robson");
		
		Conta ccRobson = new ContaCorrente(robson);
		Conta poupancaRobson = new ContaPoupanca(robson);

		ccRobson.depositar(100);
		ccRobson.transferir(50, poupancaRobson);
		
		ccRobson.imprimirExtrato();
		poupancaRobson.imprimirExtrato();

        Cliente artur = new Cliente();
		venilton.setNome("Artur");
		
		Conta ccArtur = new ContaCorrente(artur);
		Conta poupancaArtur = new ContaPoupanca(artur);

		ccArtur.depositar(150);
		ccArtur.transferir(30, poupancaArtur);
		
		ccArtur.imprimirExtrato();
		poupancaArtur.imprimirExtrato();
        
	}

}