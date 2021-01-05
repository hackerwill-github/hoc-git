package Shop;

class BookStore extends Shop {
	private int numberBook;
	private float price;
	
	BookStore() {
		// TODO Auto-generated constructor stub
	}

	void setnumberBook(int numberBook) {
		this.numberBook = numberBook;
	}

	int getnumberBook() {
		return numberBook;
	}
	
	void setPrice(float price) {
		this.price = price;
	}

	double getPrice() {
		return price;
	}
	
	@Override
	double GetValue() {
		// TODO Auto-generated method stub
		return numberBook * price;
	}

	void GetInfo() {
		System.out.println("Tổng giá trị của cửa hàng là: " + GetValue());
		super.GetInfo();
		System.out.println("Số đầu sách trong cửa hàng là: " + numberBook);
		System.out.println("Giá trị của từng sản phẩm: " + price);
	}
}
