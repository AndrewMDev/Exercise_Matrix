package Matrices;

import java.util.Scanner;

public class Matriz_identidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter=new Scanner(System.in);
		
		int matriz[][]=new int[7][7];
		
		
		//Fill the matrix
		System.out.println("\n Matrix");
		for(int i =0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(i==j) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=0;
				}
				
			}
		}
		
		
		// Print matrix
		for(int i =0 ;i<7;i++) {
			for(int j=0;j<7;j++) {
				System.out.print(matriz[i][j]+ " ");
				
			}
			System.out.println();
		}
		
		
	}

}
