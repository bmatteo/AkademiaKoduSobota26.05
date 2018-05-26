import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Screen mainScreen = new Screen(3,3,4,5);

        Screen smallScreen1 = new Screen(2,5,2,1);
        Screen smallScreen2 = new Screen(6,7,2,2);
        Screen smallScreen3 = new Screen(4,1,1,4);


        ArrayList<Screen> a1 = new ArrayList<>();
        a1.add(smallScreen1);
        a1.add(smallScreen2);
        a1.add(smallScreen3);

        double coverage = ScreenPercent.coveragePercent(a1, mainScreen);

        System.out.println(coverage);


    }
}
