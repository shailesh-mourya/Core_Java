package pkg1basic_practices;

class Students {
	private String name;
	private int id;
	private String address;
	private int fees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

}

public class MainPojo {
	public static void main(String[] args) {

		Students s = new Students();
		s.setName("Shailesh");
		System.out.println(s.getName());
		s.setName("ajay sir");
		System.out.println(s.getName());

	}

}
