package pkg1chapter1;

class Bsc {
	String math = "math";
	String english = "english";
	String it = "information technology";

	void cource1() {
		System.out.println(math);
		System.out.println(english);
		System.out.println(it);
	}

}

class Bcom {
	String eco = "economic";
	void cource2(){
		Bsc bsc = new Bsc();
		System.out.println(eco);
		System.out.println(bsc.math);
	}
}

public class MainSix {
	public static void main(String[] args) {
		Bsc bsc = new Bsc();
		bsc.cource1();
		
		Bcom bcom = new Bcom();
		bcom.cource2();
	}
}
