public class StockManagement {

	public static void main(String[] args) {
	 boolean loop = false;
	 
		
		
		ItemsList items = new ItemsList(loop);
		
			while (!loop ) {	
			
			loop = items.getItems();
			items.searchItem();
			if(items.loop ==true) {
				break;
			}
		
		
			
		}
		}
		
		
		

	

}