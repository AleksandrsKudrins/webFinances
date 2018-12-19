package ak.webFinances.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "orders")
public class Orders {
	@Id
	private String id;
	@Column (name ="po_number")
	private String poNumber;
	private String description;
	private float sum;
	private String status;
	
	@ManyToOne
	private Users user;
	
	public Orders() {
		
	}
	
	public Orders(String id, String poNumber, String description, float sum, String status, String userId) {
		super();
		
		this.id = id;
		this.poNumber = poNumber;
		this.description = description;
		this.sum = sum;
		this.status = status;
		this.user = new Users(userId, "", "", "", "");
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

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
}