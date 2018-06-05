package facades;

import subsystem.*;

/**
 * Home Theater Facade
 */
public class HomeTheaterFacade {

    /**
     * Dependencies...
     */
    private Lights lights = new Lights();
    private Amplifier amplifier = new Amplifier();
    private DvdPlayer dvdPlayer = new DvdPlayer();
    private Projector projector = new Projector();
    private Screen screen = new Screen();
    private PopcornPopper popcornPopper = new PopcornPopper();


    /**
     * Simplified method for watching movies
     *
     * @param movie - provided movie name
     */
    public void watchMovie(String movie)
    {
        System.out.println("Get ready to watch movie...");
        popcornPopper.on();
        lights.off();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(15);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        System.out.println("Everything is ready for watching movie!");
    }

    /**
     * Simplified method for stopping movie.
     */
    public void stopMovie()
    {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
        System.out.println("Movie theater is closed!");
    }
}
