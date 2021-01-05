package Shop;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class General {
	public static void main(String[] args) {
		ArrayList<Shop> listshops = new ArrayList<Shop>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Số cửa hàng bạn muốn nhập là: ");
		int numbershop = input.nextInt();

		for (int i = 0; i < numbershop; i++) {
			System.out.println("----------Type of shop: ----------");
			System.out.println("---------- 1 .Pharmacy  ----------");
			System.out.println("---------- 2 .Bookstore ----------");
			
			int n = input.nextByte();
			if (n == 1) {
				Pharmacy shop = new Pharmacy();
				
				System.out.println("Shop "+(i+1) + " Pharmacy");
				input.nextLine();
				
				System.out.print("Chủ cửa hàng: ");
				String owner = input.nextLine();
				
				System.out.print("Địa chỉ cửa hàng: ");
				String address = input.nextLine();
				
				System.out.print("Ngày thành lập: ");
				String date = input.nextLine();
				
				System.out.print("Sản phẩm nhập vào: ");
				int numberImport = input.nextInt();
				
				System.out.print("Sản phẩm bán ra: ");
				int numberSold = input.nextInt();
				
				System.out.print("Giá trị trung bình của từng sản phẩm là: ");
				float price = input.nextFloat();
				
				listshops.add(shop);
				shop.setOwner(owner);
				shop.setAddress(address);
				shop.setDate(date);
				shop.setImportItem(numberImport);
				shop.setSoldItem(numberSold);
				shop.setPrice(price);
				System.out.println("Tổng giá trị của cửa hàng " + (i+1)+ " là: "+ shop.GetValue());

			}
			else {
				BookStore shop = new BookStore();
				
				System.out.println("Shop "+(i+1) + " BookStore");
				input.nextLine();
				
				System.out.print("Chủ cửa hàng: ");
				String owner = input.nextLine();
				
				System.out.print("Địa chỉ: ");
				String address = input.nextLine();
				
				System.out.println("Ngày thành lập: ");
				String date = input.nextLine();
				
				System.out.print("Số đầu sách: ");
				int numberBook = input.nextInt();
				
				System.out.print("Giá trị trung bình của từng sản phẩm là: ");
				float price = input.nextFloat();
				
				listshops.add(shop);
				shop.setOwner(owner);
				shop.setAddress(address);
				shop.setDate(date);
				shop.setnumberBook(numberBook);
				shop.setPrice(price);
				System.out.println("Tổng giá trị của cửa hàng  " + (i+1)+ " là: "+ shop.GetValue());
			}
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		
		ValueComparator valuecomparation = new ValueComparator();
		Collections.sort(listshops, valuecomparation);
		
		System.out.println("------------------------------------------------ Sau khi sắp xếp ------------------------------------------------ ");
		
		for(int i=0; i< listshops.size(); i++) {
			listshops.get(i).GetInfo();
			System.out.println("*************************************************");
		}
		
		System.out.println("\nCửa hàng có giá trị lớn nhất là: " );
		listshops.get(listshops.size()-1).GetInfo();
		
		System.out.println("\nCửa hàng có giá trị nhỏ nhất là: ");
		listshops.get(0).GetInfo();
	}
}