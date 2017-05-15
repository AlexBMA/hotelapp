package model;

public class Hotel {

	private int stars;
	private int id;
	private String roomListName;
	private String name;

	public Hotel() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomListName() {
		return roomListName;
	}

	public void setRoomListName(String roomListName) {
		this.roomListName = roomListName;
	}

}
