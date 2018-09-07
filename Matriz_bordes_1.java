package Matrices;

public class Matriz_bordes_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][]=new int[5][5];
		
		
		
		// Fill the matrix
		for(int i=0; i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0 || i==4) { //Limit of columns
					matrix[i][j]=1;
				}
				else if(j==0 || j==4) {
					matrix[i][j]=1;
				}
				else {
					matrix[i][j]=0;
				}
			}
		}
		
		System.out.println("The matrix is");
		for(int i=0; i<5;i++) {
			for(int j=0;j<5;j++) {
			System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
