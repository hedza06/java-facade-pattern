import facades.HomeTheaterFacade;

public class FacadeApp {

    public static void main(String[] args)
    {
        // calling facade that simplify interface...
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.watchMovie("Baby Driver");
        homeTheaterFacade.stopMovie();
    }

}
