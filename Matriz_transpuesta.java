package Matrices;

import java.util.Scanner;

public class Matriz_transpuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter=new Scanner(System.in);
		
		int matriz1[][];
		int matriz2[][];
		
		matriz1=new int[5][9];
		matriz2=new int[9][5];
		
		System.out.println("Digite la matriz 1 ");
		//Fill matrix 1
		for(int i =0 ;i<5;i++) {
			for(int j=0;j<9;j++) {
				System.out.print("Matriz [ "+i+"] ["+j+"] : ");
				matriz1[i][j]=enter.nextInt();
				
			}
		}
		
		
		// Matrix sin cambios 
				System.out.println("Original Matrix");
				for(int i =0 ;i<5;i++) {
					for(int j=0;j<9;j++) {
						System.out.print(matriz1[i][j]+" ");
						
					}
					System.out.println();
				}
		
		
		//TRANSPUESTA
		
		for(int i =0 ;i<5;i++) {
			for(int j=0;j<9;j++) {
				matriz2[j][i]=matriz1[i][j];
				
			}
			
		}
		System.out.println("La matriz transpuesta es ");
	
		for(int i =0 ;i<9;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matriz2[i][j]+ " ");
				
			}
			System.out.println();
		
				
		
	}
		
	}

}
