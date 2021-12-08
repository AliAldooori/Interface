package interface_1;

public class CD  implements RetailItem{
  @Override
	public String toString() {
		return "CD [price=" + price + ", title=" + title + ", artist=" + artist + "]";
	}


int price ;
  String title ;
  String artist ;
  
  
	public CD() {
	super();
}


	public CD(int price, String title, String artist) {
	super();
	this.price = price;
	this.title = title;
	this.artist = artist;
}


	@Override
	public int item_prise() {
		// TODO Auto-generated method stub
		return price ;
	}
public void print_details (CD c) {
	
	System.out.println(c.item_prise());
	System.out.println(c.getPrice());
	System.out.println(c.getArtist());
	System.out.println(c.getTitle());
	
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getArtist() {
	return artist;
}


public void setArtist(String artist) {
	this.artist = artist;
}
}
