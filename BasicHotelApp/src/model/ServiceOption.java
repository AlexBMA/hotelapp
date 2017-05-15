package model;

public class ServiceOption {

	
	private int id;
	private String name;
	private int position;
	
	
	
	public ServiceOption() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "ServiceOption [id=" + id + ", name=" + name + ", position=" + position + "]";
	}
	
	
}
