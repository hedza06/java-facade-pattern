package subsystem;

public class Amplifier {

    public void on() {
        System.out.println("Amplifier on.");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("Setting DVD");
    }

    public void setSurroundSound() {
        System.out.println("Setting surround sound.");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }

    public void off() {
        System.out.println("Amplifier off.");
    }
}
