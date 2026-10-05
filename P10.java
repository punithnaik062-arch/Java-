package atm;

public class P10 {
	int a  ;
	int b ;
	void add(int c , int d) {
		a=c;
		b=d;
	}
	void add1() {
		 System.out.println(a+b);
	}
	public static void main(String[] args) {
		P10 ff = new P10();
		ff.add(2, 3);
		ff.add1();
	}

}
