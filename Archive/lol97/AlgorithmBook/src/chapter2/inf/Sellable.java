package chapter2.inf;
/**
 * interface for objects that can be sold
 * */
public interface Sellable {
	/**
	 * Return a description of the object
	 * */
	public String description();
	
	/**
	 * Return the list price in cents
	 * */
	public int listPrice();
	
	/**
	 * Return the lowest price in cents we will accept
	 * */
	public int lowestPrice();
}
