package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sum_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner enter=new Scanner(System.in);
		int matrix1 [][],matrix2[][],suma[][];
		int nFilas,nColumnas;
		
		
		nFilas= Integer.parseInt(JOptionPane.showInputDialog("Enter the  row "));
		nColumnas= Integer.parseInt(JOptionPane.showInputDialog("Enter the  columns "));
		matrix1= new int[nFilas][nColumnas];
		matrix2= new int[nFilas][nColumnas];
		suma= new int[nFilas][nColumnas];
		
		System.out.println("Fill the matrix");
		//FILL THE MATRIX
		for(int i =0;i<nFilas;i++) {
			for(int j=0;j<nColumnas;j++) {
				System.out.println("MATRIX [ "+i+" ]["+j+" ] : ");
				matrix1[i][j]=enter.nextInt();
			}
		}
		
		System.out.println("Fill the matrix 2");
		//FILL THE MATRIX 2
		for(int i =0;i<nFilas;i++) {
			for(int j=0;j<nColumnas;j++) {
				System.out.println("MATRIX [ "+i+" ]["+j+" ] :");
				matrix2[i][j]=enter.nextInt();
			}
		}
		
		
		//SUMA 
		
		for(int i =0 ;i<nFilas;i++) {
			for(int j=0;j<nColumnas;j++) {
				suma[i][j]=matrix1[i][j] + matrix2[i][j];
			}
		}
		
		
		//SHOW MATRIX SUM
		System.out.println("SUMA");
		for(int i =0;i<nFilas;i++) {
			for(int j=0;j<nColumnas;j++) {
				
				System.out.print(suma[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
