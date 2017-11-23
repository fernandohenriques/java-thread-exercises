import java.util.*;
import model.*;
import controller.*;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		List<Filial> filiais = new ArrayList<Filial>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Vendas> sVendas = new ArrayList<Vendas>();
		
		//Carrega a tabela Produtos
		produtos.add(new Produto("Camisa T-Shirt Branca",15,10));
		produtos.add(new Produto("Sunga de Praia azul",10,20));
		
		//Carrega os arrays das tabelas Filial e Vendas (ao dar "new" faz a venda)
		for(int i = 0; i<2; i++) {
			Filial f = new Filial("Filial "+Integer.toString(i),0);
			filiais.add(f);
		    for(int j = 0; j<4; j++){
		    	Produto produto = produtos.get(i);
		    	int qtde_venda = j+(10*i);
		    	double valorVenda = (j*50)+i;
		    	
		    	sVendas.add(new Vendas(f, new Date(System.currentTimeMillis()), 
		    			produto, qtde_venda, valorVenda));
	    	
				processaEstoque estoque = new processaEstoque(produto, qtde_venda);
				
				synchronized(estoque) {
					estoque.wait(300);
					Thread thread = new Thread(estoque);
					thread.start();
				}
		    }
		}
		
		//varre o array de vendas para computar as vendas por filial
		for(int y=0;y<sVendas.size();y++){
			processaVendas vendas = new processaVendas(
					sVendas.get(y).getFilial(), 
					sVendas.get(y).getValor_venda()
			);
			
			synchronized(vendas) {
				vendas.wait(300);
				Thread thread = new Thread(vendas);
				thread.start();
			}
		}
		
		for(Filial filial : filiais) {
			System.out.println(filial.getNome()+" -> "+filial.getTotaldeVendas());
		}
		
		System.out.println("\n\n");
		
		for(Produto prod : produtos) {
			System.out.println(prod.getNome()+" -> Qtde. em estoque atualizada: "
							  	+prod.getQtde_estoque()
							  );
		}
		
	}

}
