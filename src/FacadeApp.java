import facades.HomeTheaterFacade;

public class FacadeApp {

    public static void main(String[] args)
    {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.watchMovie("Baby Driver");
        homeTheaterFacade.stopMovie();
    }

}
