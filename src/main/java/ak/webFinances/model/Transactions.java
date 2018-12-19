package ak.webFinances.model;

import java.sql.Date;

public class Transactions {

	private int id;
	private int balanceId;
	private int poId;
	private String type;
	private float amount;
	private Date date;
	private String status;
	private String description;
	
	public Transactions(int id, int balanceId, int poId, String type, float amount, Date date, String status, String description) {
		super();
		
		this.id = id;
		this.balanceId = balanceId;
		this.poId = poId;
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.status = status;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalanceId() {
		return balanceId;
	}

	public void setBalanceId(int balanceId) {
		this.balanceId = balanceId;
	}

	public int getPoId() {
		return poId;
	}

	public void setPoId(int poId) {
		this.poId = poId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
