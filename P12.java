package atm;

	//
	class Parent2 {
		private int a;
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
	}

	class P12 extends Parent2 {

		public static void main(String[] args) {
			P12 bb = new P12();
			bb.setA(34);
			int ss = bb.getA();
			System.out.println(ss);
		}

	}
	


