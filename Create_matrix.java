package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Create_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner enter=new Scanner(System.in);
		
		int matriz [][]= {{1,2,3},{4,5,6},{7,8,9}};
		int nFilas,nColumnas;
		nFilas=Integer.parseInt(JOptionPane.showInputDialog(" Digite el numero de filas "));
		nColumnas=Integer.parseInt(JOptionPane.showInputDialog(" Digite el numero de columnas "));
		
		matriz =new int[nFilas][nColumnas];
		
		System.out.println(" FILL THE MATRIZ");
		for(int i =0;i<nFilas;i++) {//Filas
			for(int j=0;j<nColumnas;j++) {//Columnas
				System.out.print("MATRIZ [ "+i+" ]["+j+" ]");
				matriz[i][j]=enter.nextInt();
			}
			
						
		}
		
				System.out.println(" SHOW THE MATRIZ");
				for(int i =0;i<nFilas;i++) {//Filas
					for(int j=0;j<nColumnas;j++) {//Columnas
						System.out.print(matriz[i][j]);
						}
					System.out.println();
				}
				
				
	}

}
