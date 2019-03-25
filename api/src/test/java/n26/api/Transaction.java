package n26.api;

public class Transaction {
	// Private fields
	private long transaction_id;
	private double amount;
	private String type;
	private long parent_id;
	
	private static Transaction instance;
	
	public static Transaction getInstance(long transaction_id, double amount, String type, long parent_id) {
		if (instance == null) {
			instance = new Transaction(transaction_id, amount, type, parent_id);
		} else {
			instance.setTransaction_id(transaction_id);
			instance.setAmount(amount);
			instance.setType(type);
			instance.setParent_id(parent_id);
		}
		return instance;
	}
	
	public static Transaction getInstance() {
		return instance;
	}
	
	// Constructor 
	private Transaction(long transaction_id, double amount, String type, long parent_id) {
		this.transaction_id = transaction_id;
		this.amount = amount;
		this.type = type;
		
		this.parent_id = parent_id;
	}
	
	// Getters
	public long getTransaction_id() {
		return transaction_id;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getType() {
		return type;
	}
	
	public long getParent_id() {
		return parent_id;
	}
	
	// Setters
	private void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}
	
	private void setAmount(double amount) {
		this.amount = amount;
	}
	
	private void setType(String type) {
		this.type = type ;
	}
	
	private void setParent_id(long parent_id) {
		this.parent_id = parent_id;
	}
	
	
	
	
}
