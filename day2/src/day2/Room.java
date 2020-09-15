package day2;

public class Room {
	int roomno;
	String roomtype;
	int roomarea;
	boolean hasACmachine;
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public int getRoomarea() {
		return roomarea;
	}
	public void setRoomarea(int roomarea) {
		this.roomarea = roomarea;
	}
	public boolean isACmachine() {
		return hasACmachine;
	}
	public void setACmachine(boolean aCmachine) {
		hasACmachine = aCmachine;
	}

}
