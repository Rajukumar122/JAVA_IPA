import java.util.Scanner;
class A 
{
    public static void main(String[]args)
    {
         Scanner s=new Scanner(System.in);
         int x=s.nextInt();
         System.out.printn(x);
    }
}
class Train 
{
    int x;
    Train(int x)
    {
      this.x=x;
    }
    int [] arr= new int[x];
    public boolean reserveSeats(int numSeata)
}
class  Passenger 
{

}




import java.util.Scanner;

class Passenger {
    private int reservedSeats;

    public boolean reserveSeats(int numSeats) {
        this.reservedSeats += numSeats;
        return true;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }
}

class Train {
    private int totalSeats;
    private int availableSeats;

    public Train(int totalSeats) {
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public boolean checkAvailability(int numSeats) {
        return availableSeats >= numSeats;
    }

    public boolean reserveSeats(int numSeats) {
        if (checkAvailability(numSeats)) {
            availableSeats -= numSeats;
            return true;
        }
        return false;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public int getReservedSeats() {
        return totalSeats - availableSeats;
    }
}

class ReservationSystem {
    private Train train;

    public ReservationSystem(Train train) {
        this.train = train;
    }

    public void displayStatus() {
        System.out.println("Available seats: " + train.getAvailableSeats());
        System.out.println("Reserved seats: " + train.getReservedSeats());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total number of seats in the train
        int totalSeats = scanner.nextInt();
        Train train = new Train(totalSeats);

        // Input number of seats passengers want to check availability
        int numSeatsToCheck = scanner.nextInt();
        System.out.println(train.checkAvailability(numSeatsToCheck));

        // Input number of seats passengers want reserved
        int numSeatsToReserve = scanner.nextInt();
        Passenger passenger = new Passenger();
        boolean reservationStatus = passenger.reserveSeats(numSeatsToReserve);
        System.out.println(reservationStatus);

        ReservationSystem reservationSystem = new ReservationSystem(train);
        reservationSystem.displayStatus();

        scanner.close();
    }
}
