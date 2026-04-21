import java.time.LocalTime;

public class AlarmApp {
    public static void main(String[] args) throws InterruptedException {

        // Set alarm time (HH:MM:SS)
        LocalTime alarmTime = LocalTime.of(15, 30, 0); // 3:30:00 PM

        System.out.println("Alarm set for: " + alarmTime);

        while (true) {
            LocalTime now = LocalTime.now();

            // Check if current time matches alarm time
            if (now.getHour() == alarmTime.getHour() &&
                now.getMinute() == alarmTime.getMinute() &&
                now.getSecond() == alarmTime.getSecond()) {

                System.out.println("⏰ Alarm! Time reached!");
                break;
            }

            // Wait for 1 second
            Thread.sleep(1000);
        }
    }
}
