package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sum_row_Col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner enter=new Scanner(System.in);
		
		int matriz[][],nRows,nColumns,Sum_rows,Sum_Columns;
		
		nRows=Integer.parseInt(JOptionPane.showInputDialog("Amount of row"));
		nColumns=Integer.parseInt(JOptionPane.showInputDialog("Amount of columns"));
		matriz=new int [nRows][nColumns];
		
		//FILL THE MATRIX
		for(int i=0;i<nRows;i++) {
			for(int j=0;j<nColumns;j++) {
				System.out.print("Matriz ["+i+"]["+j+"] : ");
				matriz[i][j]=enter.nextInt();
			}
			
		}
		
		//SHOW THE MATRIX ORIGINAL
		for(int i=0;i<nRows;i++) {
			for(int j=0;j<nColumns;j++) {
				System.out.print(matriz[i][j]+" ");
				
			}
			System.out.println();
		}
		
		//SUM FOR EACH ROWS 
		
		for(int i=0;i<nRows;i++) {
			Sum_rows=0;
			for(int j=0;j<nColumns;j++) {
				Sum_rows += matriz[i][j];
				
			}
			
			System.out.print("\n The sum for each rows ["+i+"] is : "+Sum_rows);
		}
		
		System.out.println();
		
		//SUM FOR EACH COLUMNS
		
				for(int j=0;j<nRows;j++) {
					Sum_Columns=0;
					for(int i=0;i<nColumns;i++) {
						Sum_Columns += matriz[i][j];
						
					}
					
					System.out.print("\n The sum for each columns ["+j+"] is : "+Sum_Columns);
				}
				
				System.out.println();
		
		
	}

}
