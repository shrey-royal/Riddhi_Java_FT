interface Hotel {
    public void bookRoom();
    public void cancelRoom();
    public void orderFood();
    public void cancelFood();
    public void roomService();
    public void checkIn();
    public void checkOut();
}

interface SmallHotel extends Hotel {
    public void checkIn();
    public void checkOut();
}

class TajHotel implements Hotel, SmallHotel {
    @Override
    public void bookRoom() {
        System.out.println("Room booked at Taj Hotel");
    }

    @Override
    public void cancelRoom() {
        System.out.println("Room cancelled at Taj Hotel");
    }

    @Override
    public void orderFood() {
        System.out.println("Food ordered at Taj Hotel");
    }

    @Override
    public void cancelFood() {
        System.out.println("Food cancelled at Taj Hotel");
    }

    @Override
    public void roomService() {
        System.out.println("Room service at Taj Hotel");
    }

    @Override
    public void checkIn() {
        System.out.println("Checked in at Taj Hotel");
    }

    @Override
    public void checkOut() {
        System.out.println("Checked out at Taj Hotel");
    }

    public void swimmingPool() {
        System.out.println("Swimming pool at Taj Hotel");
    }

    public void gym() {
        System.out.println("Gym at Taj Hotel");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // TajHotel tajHotel = new TajHotel();

        // tajHotel.bookRoom();
        // tajHotel.cancelRoom();
        // tajHotel.orderFood();
        // tajHotel.cancelFood();
        // tajHotel.roomService();
        // tajHotel.checkIn();
        // tajHotel.checkOut();
        // tajHotel.swimmingPool();
        // tajHotel.gym();

        SmallHotel guestHouse = new SmallHotel() {  // Anonymous class
            @Override
            public void bookRoom() {
                System.out.println("Room booked at Guest House");
            }

            @Override
            public void cancelRoom() {
                System.out.println("Room cancelled at Guest House");
            }

            @Override
            public void orderFood() {
                System.out.println("Food ordered at Guest House");
            }

            @Override
            public void cancelFood() {
                System.out.println("Food cancelled at Guest House");
            }

            @Override
            public void roomService() {
                System.out.println("Room service at Guest House");
            }

            @Override
            public void checkIn() {
                System.out.println("Checked in at Guest House");
            }

            @Override
            public void checkOut() {
                System.out.println("Checked out at Guest House");
            }
        };

        guestHouse.bookRoom();
        guestHouse.cancelRoom();
        guestHouse.orderFood();
        guestHouse.cancelFood();
        guestHouse.roomService();
        guestHouse.checkIn();
        guestHouse.checkOut();

    }
}
