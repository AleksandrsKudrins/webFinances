package ak.webFinances.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "orders")
public class Orders {
	@Id
	private String id;
	@Column (name ="po_number")
	private String poNumber;
	private String description;
	@Column (name = "user_id")
	private String userId;
	private float sum;
	private String status;
	
	public Orders() {
		
	}
	
	public Orders(String id, String poNumber, String description, String userId, float sum, String status) {
		super();
		
		this.id = id;
		this.poNumber = poNumber;
		this.description = description;
		this.userId = userId;
		this.sum = sum;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public float getSum() {
		return sum;
	}

	public void setSum(float sum) {
		this.sum = sum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
