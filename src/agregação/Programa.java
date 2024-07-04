package agregação;

public class Programa {
public static void main (String args[]) {

long codigo;
double valor;
String nome;

Produto produtoTV = criarProduto(  1L, 10d, "TV");
Produto produtoCel = criarProduto( 12L, 1000d, "Celular");
Vendedor vendedor = criarVendedor("Aylan", 10d);
Comprador comprador = criarComprador("Moura", 1000d);
Venda venda = new Venda();
venda.setComprador(comprador);
venda.setVendedor(vendedor);
venda.add(produtoTV);
venda.add(produtoCel);
venda.concretizarVenda();

}
private static Comprador criarComprador(String nome, Double verba) {
	return new Comprador(nome, verba);
	
}
private static Vendedor criarVendedor(String nome, Double comissao) {
	Vendedor vendedor = new Vendedor();
	vendedor.setComissao(comissao);
	vendedor.setNome(nome);
	return vendedor;
}
private static Produto criarProduto(Long codigo, Double valor, String nome) {
	Produto produto = new Produto();
	produto.setCodigo(codigo);
	produto.setNome(nome);
	produto.setPreco(valor);
	return produto;
}
}

