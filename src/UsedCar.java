
public class UsedCar extends Car {
	
	int miles;
	

	public UsedCar(String make, String model, int year, double price, int miles) {
		super(make, model, year, price);
		// TODO Auto-generated constructor stub
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getMiles() {
		return miles;
	}


	public void setMiles(int miles) {
		this.miles = miles;
	}
	@Override
	public String toString(){
		return "New\t" + make + "\t" + model + "\t" + year + "\t" + price +"\t" + miles;
}
}
