package fisjava;

class DelhiShop implements Shop {

	@Override
	public void selectGoods() {
		// TODO Auto-generated method stub
		System.out.println(shopno);
		System.out.println("goods are selected from www.delhishop.com");
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("payment can be any online mode viz netbanking, upi, credit card or debit card");
	}

	@Override
	public void shipment() {
		// TODO Auto-generated method stub
		System.out.println("items are delivered through dtdc courier");
		
	}
	
}

class VillageShop implements Shop {

	@Override
	public void selectGoods() {
		// TODO Auto-generated method stub
		System.out.println("items are selected from shop only");
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("cash payment is only accepted");
	}

	@Override
	public void shipment() {
		// TODO Auto-generated method stub
		System.out.println("no shipment is done...");
		
	}
	
}




public class TestShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DelhiShop d = new DelhiShop();
		d.selectGoods();
		d.payment();
		d.shipment();
		
		VillageShop v = new VillageShop();
		v.selectGoods();
		v.payment();
		v.shipment();

	}

}
