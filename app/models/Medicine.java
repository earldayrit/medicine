package models;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Medicine {
	
	/*public static MongoCollection collections() {
		return PlayJongo.getCollection("Medicine");
	}*/
	

	@JsonProperty("_id")
	private ObjectId objectId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("stock_quantity")
	private long stockQunatity;
	@JsonProperty("allowed_per_employee")
	private int allowedPerEmployee;
	@JsonProperty("alert_quantity")
	private int alertQuantity;
	@JsonProperty("critical_alert_quantity")
	private int criticalAlertQuantity;
	
//	public static JongoDAO<Medicine> medicineDao(){
//		return new JongoDAO<Medicine>("Medicine",Medicine.class){};
//	}	
	
	public ObjectId getObjectId() {
		return objectId;
	}
	public void setObjectId(ObjectId id) {
		this.objectId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getStockQunatity() {
		return stockQunatity;
	}
	public void setStockQunatity(long qunatity) {
		this.stockQunatity = qunatity;
	}
	public int getAllowedPerEmployee() {
		return allowedPerEmployee;
	}
	public void setAllowedPerEmployee(int allowedPerEmployee) {
		this.allowedPerEmployee = allowedPerEmployee;
	}
	public int getAlertQuantity() {
		return alertQuantity;
	}
	public void setAlertQuantity(int alertQuantity) {
		this.alertQuantity = alertQuantity;
	}
	public int getCriticalAlertQuantity() {
		return criticalAlertQuantity;
	}
	public void setCriticalAlertQuantity(int criticalAlertQuantity) {
		this.criticalAlertQuantity = criticalAlertQuantity;
	}	
}
