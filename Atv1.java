package Matriz01;

public class Atv1 {
	public static void main(String[] args) {
		
		int m[][] = new int [5][5];
		
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
		
				int verificar = (int)Math.round(Math.random()*100);
				if (verificar %2 == 0){
					m[i][j] = verificar;
				}
				else {
					j = 0;
				}
			}
		}
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.println("os valores sao "+ m[i][j]);
			}
		}
	}
}