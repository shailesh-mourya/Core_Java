package pkg1chapter1;

class Keywords {
	public String v_public = "public variable";
	private String v_private = "private variable";
	protected String v_protected = "protected variable";
	String v_default = "default variable";
	
	void meth1(){
		System.out.println(v_public);
		System.out.println(v_private);
		System.out.println(v_protected);
		System.out.println(v_default+ "\n");
	}
}
public class MainThree extends Keywords{
	public static void main(String[] args) {
		Keywords k = new Keywords();
		k.meth1();
		System.out.println(k.v_public);
		System.out.println(k.v_protected);
		System.out.println(k.v_default);

	}
}
