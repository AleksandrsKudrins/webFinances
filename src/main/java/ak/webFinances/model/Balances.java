package ak.webFinances.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "balances")
public class Balances {
	@Id
	private String id;
	@Column (name = "open_balance")
	private float openBalance;
	@Column (name = "negative_flag")
	private String negativeFlag;
	@Column (name = "last_update_date")
	private String lastUpdateDate;
	private String status;
	private int creditLimit;
	
	@OneToOne
	private Users user;
	
	public Balances() {
		
	}
	
	public Balances(String id, float openBalance, String negativeFlag, String lastUpdateDate, String status, int creditLimit, String userId) {
		super();
		
		this.id = id;
		this.openBalance = openBalance;
		this.negativeFlag = negativeFlag;
		this.lastUpdateDate = lastUpdateDate;
		this.status = status;
		this.creditLimit = creditLimit;
		this.user = new Users(userId, "", "", "", "");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
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

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
}
