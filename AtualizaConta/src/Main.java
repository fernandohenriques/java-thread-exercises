import java.util.*;
import model.Conta;
import controller.Movimentacao;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		List<Conta> contas = new ArrayList<Conta>();
		
		//Cria array das contas
		for( int i = 1; i<11; i++) {
			Conta c = new Conta(createNumberConta(i,i), i*10.00);
			System.out.println(c);
			contas.add(c);
		}
		
		//Movimenta valores entre as contas
		  //Chamar com a Thread
		
		for(int y=0;y<contas.size();y++){
			int prox = ( y+1==contas.size() ? y-(contas.size()-2) : y+1);
			
			Movimentacao m = new Movimentacao((int)System.currentTimeMillis(), 
					new Date(System.currentTimeMillis()), contas.get(y), contas.get(prox), 
					(contas.get(y).getSaldo()%3));
			
			synchronized(m) {
				m.wait(1000);
				m.setNthread((y+1)*2030);
				Thread thread = new Thread(m);
				thread.start();
			}
		}
		
	}
	
	private static String createNumberConta(int i, int j){
		String sJ = Integer.toString(j);
		String numberConta = Integer.toString(i);
		if(numberConta.length() != 4){
			return createNumberConta(i+10,j); 
		} else {
			 return numberConta+"-"+sJ;
		}
	}

}