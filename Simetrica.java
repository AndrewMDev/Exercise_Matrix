package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Simetrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner enter=new Scanner(System.in);
		
		int matriz [][];
		int nFilas,nColumnas;
		nFilas=Integer.parseInt(JOptionPane.showInputDialog(" Digite el numero de filas "));
		nColumnas=Integer.parseInt(JOptionPane.showInputDialog(" Digite el numero de columnas "));
		boolean simetrica=true;
		
		
		matriz =new int[nFilas][nColumnas];
		
		System.out.println(" FILL THE MATRIZ");
		
		for(int i =0;i<nFilas;i++) {//Filas
			for(int j=0;j<nColumnas;j++) {//Columnas
				System.out.print("MATRIZ [ "+i+" ]["+j+" ]");
				matriz[i][j]=enter.nextInt();
			}
		}
		
		if(nFilas==nColumnas) {
			int i,j;
			i=0;
			while(i<nFilas&& simetrica==true) {
				j=0;
				
				while(j<i && simetrica==true) {
					if(matriz[i][j]!=matriz[j][i]) {
						simetrica=false;
					}
					j++;
				}
				i++;
			}
			
			if(simetrica==true) {
				JOptionPane.showMessageDialog(null," The matrix is simetric");
			}
			else {
				JOptionPane.showMessageDialog(null," The matrix is not a  simetric");
			}
		}
		else {
			JOptionPane.showMessageDialog(null," The matrix is not a  simetric");
		}

	}
	
}	
