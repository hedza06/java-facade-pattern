package subsystem;

/**
 * DvD Player Definition.
 */
public class DvdPlayer {

    public void on() {
        System.out.println("DVD player on.");
    }

    public void play(String movie) {
        System.out.println("Start playing movie " + movie);
    }

    public void stop() {
        System.out.println("Stopping DVD player.");
    }

    public void eject() {
        System.out.println("Ejecting DVD.");
    }

    public void off() {
        System.out.println("DVD player off.");
    }
}
