
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		 int[] divisores = new int[numero]; 
		int contador = 0;
		
		for(int i=1; i<=numero; i++){
		    
		    if(numero % i == 0){
		        divisores[contador] = i;
		        contador++;
		        
		    }
		    
		}
		
		for(int j = 0; j<contador; j++){
		    System.out.print(divisores[j] + " ");
		}
		System.out.println();
	}
}
