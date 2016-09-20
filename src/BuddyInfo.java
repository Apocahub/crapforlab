
public class BuddyInfo {

	private String name = "o wow";

	private String address = "hell";

	public static void main(String[] args) {
		BuddyInfo crap = new BuddyInfo();
		crap.setName("wow o");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
