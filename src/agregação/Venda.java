package agregação;

import java.util.ArrayList;
import java.util.List;

public class Venda {
private Vendedor vendedor;
private Comprador comprador;
private Produto produto;
private List<Produto> produtos;
public Venda() {
	this.produtos = new ArrayList<>();
	}
public Vendedor getVendedor() {
	return vendedor;
}
public void setVendedor(Vendedor vendedor) {
	this.vendedor = vendedor;
}
public Comprador getComprador() {
	return comprador;
}
public void setComprador(Comprador comprador) {
	this.comprador = comprador;
}
public Produto getProduto() {
	return produto;
}
public void setProduto(Produto produto) {
	this.produto = produto;
}
public List<Produto> getProdutos(){
	return produtos;
}
public void add(Produto produto) {
	this.produtos.add(produto);
}
public void concretizarVenda() {
System.out.println(" Comprador " + this.comprador.getNome());
System.out.println(" Comprou os itens: ");
for (Produto prod : this.produtos) {
	System.out.println(" Nome produto " + prod.getNome() + " Valor produto " + prod.getPreco());

}
System.out.println("Vendedor " + this.vendedor.getNome());

}
public void cancelarVenda() {
	System.out.println(" Venda cancelada ");

}

}
