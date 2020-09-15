package day2;

import java.util.Scanner;

public class RoomMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Room number, Room type, Room Area and ACmachine");
		int roomnum=scanner.nextInt();
		String roomtype=scanner.next();
		int roomarea=scanner.nextInt();
		boolean hasacmachine=scanner.nextBoolean();
		Room room=new Room();
		room.setRoomno(roomnum);
		room.setRoomarea(roomarea);
		room.setRoomtype(roomtype);
		room.setACmachine(hasacmachine);
		System.out.println("The room number is "+room.getRoomno());
		System.out.println("The Room area is "+room.getRoomarea());
		System.out.println("The Room Type is "+room.getRoomtype());
		System.out.println("ACMachine status "+room.isACmachine());
	}

}
