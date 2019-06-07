package java_oops_part1;

public class CallByValueCallByRef {
	
	int a;
	int b;

	public static void main(String[] args) {
		
		CallByValueCallByRef r= new CallByValueCallByRef();
		r.equals(r);
        int x=r.sum(88, 123);
		System.out.println(x);
		r.a=1;
		r.b=2;
		r.objectRef(r);
	}
	
	
	public int sum(int s,int t){
		
		int u=s+t;
		return u;
		
	}

	
	public void objectRef(CallByValueCallByRef d){
		int e;
		
		
		
		
		
		
		
		
	}
}
