package Matriz01;
import java.util.Scanner;
public class Atv2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int diagonal[][] = new int [4][4];
		//Entrada de dados
		for(int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				if(i==j) {
					diagonal[i][j] = (int)Math.round(Math.random()*10);
					System.out.print("["+diagonal[i][j] + "]");
				}
				else {
					diagonal[i][j] = 0;
					System.out.print("["+diagonal[i][j] + "]");
				}
			}
			System.out.println("\n-------------");
		}
		ler.close();
	}
}

