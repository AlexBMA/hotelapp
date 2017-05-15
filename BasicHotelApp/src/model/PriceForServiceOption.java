package model;

import java.util.Date;

public class PriceForServiceOption {
	
	private int value;
	private int currencyId;
	private Date dateFrom;
	private Date dateTo;
	private int id;
	private int participantTypeId;
	
	
	public PriceForServiceOption() {
		super();
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParticipantTypeId() {
		return participantTypeId;
	}
	public void setParticipantTypeId(int participantTypeId) {
		this.participantTypeId = participantTypeId;
	}
	@Override
	public String toString() {
		return "PriceForServiceOption [value=" + value + ", currencyId=" + currencyId + ", dateFrom=" + dateFrom
				+ ", dateTo=" + dateTo + ", id=" + id + ", participantTypeId=" + participantTypeId + "]";
	}
	
	
	

}
