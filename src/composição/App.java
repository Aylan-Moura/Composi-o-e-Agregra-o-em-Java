package composição;

public class App {
public static void main(String args[] ){
	
	Banco banco = new Banco();
	banco.setCodigo(10L);
	banco.setNome("Banco Aylan");
	
	ContaCorrente cc = new ContaCorrente();
	cc.setBanco(banco);
	cc.setSaldo(10d);
	
	ContaPoupanca cp = new ContaPoupanca();
	cp.setBanco(banco);
	cp.setSaldo(10d);
	
	
	
	
}
}
