package Array;
class Movie {
    private String movieName;
    private String movieStartTime;
    private String movieEndTime;
    private double movieTicketPrice;

    public void setMovie(String name, String startTime, String endTime, double ticketPrice) {
        movieName = name;
        movieStartTime = startTime;
        movieEndTime = endTime;
        movieTicketPrice = ticketPrice;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieStartTime() {
        return movieStartTime;
    }

    public String getMovieEndTime() {
        return movieEndTime;
    }

    public double getMovieTicketPrice() {
        return movieTicketPrice;
    }
}

public class Encap {
	public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setMovie("Drishyam", "7:00 PM", "9:30 PM", 750);

        System.out.println("Movie Name: " + movie1.getMovieName());
        System.out.println("Start Time: " + movie1.getMovieStartTime());
        System.out.println("End Time: " + movie1.getMovieEndTime());
        System.out.println("Ticket Price: " + movie1.getMovieTicketPrice());
    }

}
