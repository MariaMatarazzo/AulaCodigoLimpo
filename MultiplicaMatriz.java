package Aula_05_06;
public class MultiplicaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [][] = new int [3][3];
		int b [][]= new int [3][3];
		int c [][] = new int [3][3];

		for (int i =0; i<3; i++) {
			for(int j=0;j<3;j++) {
			a[i][j] = (int)Math.round(Math.random()*10);
			b[i][j] = (int)Math.round(Math.random()*10);
			c[i][j] = (int)Math.round(Math.random()*10);
			
			System.out.println ("Os valores da Matriz C são na posição"+ "["+ i +j + "]"+ "é" + c[i][j]);
			}
		}
	}
		


	}


