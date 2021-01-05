package Shop;

class Pharmacy extends Shop {
	private int numberImportItem;
	private int numberSoldItem;
	private float price;
	
	Pharmacy(int ImportItem, int SoldItem, float price,
			 String owner, String address,String date ){
		this.numberImportItem = ImportItem;
		this.numberSoldItem = SoldItem;
		this.price = price;
		super.setOwner(owner);
		super.setAddress(address);
		super.setDate(date);
	}

	Pharmacy() {
		this(0,0,0," ", " "," ");
	}

	void setImportItem(int numberImportItem) {
		this.numberImportItem = numberImportItem;
	}

	int getImportItem() {
		return numberImportItem;
	}

	void setSoldItem(int numberSoldItem) {
		this.numberSoldItem = numberSoldItem;
	}

	int getSoldItem() {
		return numberSoldItem;
	}

	void setPrice(float price) {
		this.price = price;
	}

	double getPrice() {
		return price;
	}

	int GetResidual(int i, int s) {
		int residual;
		residual = i - s;
		return residual;
	}

	@Override
	double GetValue() {
		// TODO Auto-generated method stub
		return GetResidual(numberImportItem, numberSoldItem) * price;
	}

	void GetInfo() {
		System.out.println("Tổng giá trị của cửa hàng là: " + GetValue());
		super.GetInfo();
		System.out.println("Số sản phẩm nhập vào là: " + numberImportItem);
		System.out.println("Số sản phẩm bán ra là: " + numberSoldItem);
		System.out.println("Giá trị của từng sản phẩm là: " + price);
	}

}
