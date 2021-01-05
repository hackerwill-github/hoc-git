package Shop;

abstract class Shop {
	private String owner;
	private String address;
	private String date;

	abstract double GetValue();

	public Shop(String a, String b, String c) {
		owner = a;
		address = b;
		date = c;
	}
    
	public Shop() {
		this(" ", " ", " ");
	}

	public Shop(Shop store) {

	}

	void setOwner(String owner) {
		this.owner = owner;
	}

	String getOwner() {
		return owner;
	}

	void setAddress(String address) {
		this.address = address;
	}

	String getAddress() {
		return address;
	}

	void setDate(String date) {
		this.date = date;
	}

	String getDate() {
		return date;
	}

	void GetInfo() {
		System.out.println("Chủ của hàng: " + owner);
		System.out.println("Địa chỉ: " + address);
		System.out.println("Ngày thành lập: " + date);
	}

}
