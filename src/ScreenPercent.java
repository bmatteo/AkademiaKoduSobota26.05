import java.util.ArrayList;

public class ScreenPercent {
    public static double coveragePercent(ArrayList<Screen> smallScreens, Screen mainScreen) {
        ArrayList<Screen> simpleElements = new ArrayList<>();
        for (Screen screen : smallScreens) {
            for(int rowX = screen.getX(); rowX < screen.getX() + screen.getWidth(); rowX++) {
                for(int rowY = screen.getY(); rowY < screen.getY() + screen.getHeight(); rowY++) {
                    Screen element = new Screen();
                    element.setX(rowX);
                    element.setY(rowY);
                    simpleElements.add(element);
                }
            }
        }

        double counter = 0;
        for (Screen screen : simpleElements) {
            if(screen.getX() >= mainScreen.getX() &&
                    screen.getX() < mainScreen.getX()+mainScreen.getWidth()) {


                if(screen.getY() >= mainScreen.getY() &&
                        screen.getY() < mainScreen.getY() + mainScreen.getHeight()) {

                    counter++;
                }
            }
        }

        double mainScreenArea = mainScreen.getHeight()*mainScreen.getWidth();

        return (counter/mainScreenArea)*100;
    }
}
