package beans;

public abstract class Payment {
	
	private MyDate Transaction_date;/// we created MyDate Object because it has has-a relation
	private Product product;    //we created Product Object because it has has-a relations
	private double price;
	private String type;
	private String name;
	private Location location; //we created Product Object because it has-a relations
	
	
	public String toString() {
		return Transaction_date.toString()+","+ product.getProductName()
		+","+price 
		+","+type
		+","+name
		+","+location.toString();
	}
	
	
	public MyDate getTransaction_date() {
		return Transaction_date;
	}

	public void setTransaction_date(MyDate transaction_date) {
		Transaction_date = transaction_date;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	

}
