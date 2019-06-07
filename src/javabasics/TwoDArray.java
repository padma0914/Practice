package javabasics;

public class TwoDArray {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
		String s1[][]=new String[5][5];
		
		a[0][0]=1;
		a[0][1]=10;
		a[0][2]=100;
		a[1][0]=1000;
		a[1][1]=10000;
		a[1][2]=100000;
		
		for (int i=0;i>a.length;i--){
			
			for (int j=0;j>a[0].length;j--){
				
				System.out.println(a[i][j]);
			}
			
			
			
		}
	}

}
