package spring_house.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Houses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Autowired
	private Address address;
	private String color;
	private double price;
	private double squareFootage;
	private int numberOfRooms;
	private int numberOfBathrooms;
	private boolean hasBasement;
	private boolean hasAttic;
	
	public Houses() {
		super();
	}
	
	public Houses(String color, double price, double squareFootage, int numberOfRooms, int numberOfBathrooms, boolean hasBasement, boolean hasAttic) {
		super();
		this.color = color;
		this.price = price;
		this.squareFootage = squareFootage;
		this.numberOfRooms = numberOfRooms;
		this.numberOfBathrooms = numberOfBathrooms;
		this.hasBasement = hasBasement;
		this.hasAttic = hasAttic;
}
	
	public Houses(long id, Address address, String color, double price, double squareFootage, int numberOfRooms, int numberOfBathrooms, boolean hasBasement, boolean hasAttic) {
			super();
			this.id = id;
			this.address = address;
			this.color = color;
			this.price = price;
			this.squareFootage = squareFootage;
			this.numberOfRooms = numberOfRooms;
			this.numberOfBathrooms = numberOfBathrooms;
			this.hasBasement = hasBasement;
			this.hasAttic = hasAttic;
	}
	
	// Getters and Setters

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the squareFootage
	 */
	public double getSquareFootage() {
		return squareFootage;
	}

	/**
	 * @param squareFootage the squareFootage to set
	 */
	public void setSquareFootage(double squareFootage) {
		this.squareFootage = squareFootage;
	}

	/**
	 * @return the numberOfRooms
	 */
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	/**
	 * @param numberOfRooms the numberOfRooms to set
	 */
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	/**
	 * @return the numberOfBathrooms
	 */
	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	/**
	 * @param numberOfBathrooms the numberOfBathrooms to set
	 */
	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	/**
	 * @return the hasBasement
	 */
	public boolean isHasBasement() {
		return hasBasement;
	}

	/**
	 * @param hasBasement the hasBasement to set
	 */
	public void setHasBasement(boolean hasBasement) {
		this.hasBasement = hasBasement;
	}

	/**
	 * @return the hasAttic
	 */
	public boolean isHasAttic() {
		return hasAttic;
	}

	/**
	 * @param hasAttic the hasAttic to set
	 */
	public void setHasAttic(boolean hasAttic) {
		this.hasAttic = hasAttic;
	}
	
	@Override
	public String toString() {
		return "House Information [ Id= " + id + ", Address= " + address + ", Color= " + color + ", Price= " + price + ", SquareFootage= " + squareFootage + ", NumberOfBedrooms= " + numberOfRooms + ", NumberOfBathrooms= " +
				numberOfBathrooms + ", HasBasement= " + hasBasement + " HasAttic= " + hasAttic + "]";
	}
}
