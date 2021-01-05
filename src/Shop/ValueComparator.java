package Shop;

import java.util.Comparator;

class ValueComparator implements Comparator<Shop> {

	@Override
	public int compare(Shop shop1, Shop shop2) {
		// TODO Auto-generated method stub
		return Double.compare(shop1.GetValue(), shop2.GetValue());
	}
	

}
