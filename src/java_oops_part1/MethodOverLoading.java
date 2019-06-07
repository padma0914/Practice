package java_oops_part1;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading l= new MethodOverLoading();
		int x=l.add(56, 34);
		
		//	System.out.println(x);
			
		}
		public int add(){
			int i=2;
	return i;
		}
		
		
		public int add(int a,int b){
			int c=a+b;
			System.out.println(c);
	return c;
	
		}
}
		
