class Building {
    private String buildingName = "Sky Tower";

    // Inner class Floor
    class Floor {
        private int floorNumber = 5;

        // Inner class Room inside Floor
        class Room {
            private String roomName = "Conference Room";

            public void displayDetails() {
                // Accessing outer and enclosing class members
                System.out.println("Building Name: " + buildingName);
                System.out.println("Floor Number: " + floorNumber);
                System.out.println("Room Name: " + roomName);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Building.Floor.Room room=new Building().new Floor().new Room();
        room.displayDetails();
    }
}

