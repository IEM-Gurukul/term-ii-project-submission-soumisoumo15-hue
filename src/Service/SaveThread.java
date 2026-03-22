package Service;

public class SaveThread extends Thread {

    private String data;

    public SaveThread(String data) {
        this.data = data;
    }

    public void run() {

        FileService.saveBooking(data);

        System.out.println("Booking saved in background");

    }
}
