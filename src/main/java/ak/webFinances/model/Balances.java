package ak.webFinances.model;

import java.sql.Date;

public class Balances {
	
	private int id;
	private int userId;
	private float openBalance;
	private String negativeFlag;
	private Date lastUpdateDate;
	private String status;
	private int creditLimit;
	
	public Balances(int id, int userId, float openBalance, String negativeFlag, Date lastUpdateDate, String status, int creditLimit) {
		super();
		
		this.id = id;
		this.userId = userId;
		this.openBalance = openBalance;
		this.negativeFlag = negativeFlag;
		this.lastUpdateDate = lastUpdateDate;
		this.status = status;
		this.creditLimit = creditLimit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public float getOpenBalance() {
		return openBalance;
	}

	public void setOpenBalance(float openBalance) {
		this.openBalance = openBalance;
	}

	public String getNegativeFlag() {
		return negativeFlag;
	}

	public void setNegativeFlag(String negativeFlag) {
		this.negativeFlag = negativeFlag;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
}
