package entities;

import java.util.Date;

import enumeradoa.Enumeroad;

public class Order {

	private Integer id;
	private Date moment;
	private Enumeroad status;
	public Order(Integer id, Date moment, Enumeroad status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public Enumeroad getStatus() {
		return status;
	}
	public void setStatus(Enumeroad status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	

}
