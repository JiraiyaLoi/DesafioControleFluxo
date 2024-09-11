import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao CONTADOR");
		System.out.println(" Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println(" Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();        
        
		
		terminal.close(); 
		try {
			contar(parametroUm, parametroDois);
			
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!!"); 
		}
		
	}

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem

        for(int i = 1;  i <= contagem; i++){
            System.out.println("Contando a diferença (interações): " + i);
        }
   
        System.out.println("Diferença total foi de: " + contagem  + " números (interações).");
        System.out.println("Contando a partir do  " + parametroUm  + " ao " + parametroDois + ":");

        for(int i = (parametroUm + 1);  i <= parametroDois; i++){
            System.out.println("Imprimindo o número: " + i);
        }
   
    }

}


// for(int i = parametroUm;  parametroUm <= parametroDois; parametroUm++){
//     System.out.println("Imprimindo número: " + parametroUm + " até chegar no: " + parametroDois);
// }