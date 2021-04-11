
public class TestaGetESet {
	public static void main(String[] args) {
	Conta conta = new Conta();
	//conta.numero = 1337; -> não pode mais, por nao ser publico, tem q evocar o get
	conta.setNumero(1337);
	System.out.println(conta.getNumero());
	
	Cliente paulo = new Cliente();
	paulo.setNome("Paulo Vieira");
	
	conta.setTitular(paulo);
	
	System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("Programador");
	System.out.println(conta.getTitular().getProfissao());
}
}
