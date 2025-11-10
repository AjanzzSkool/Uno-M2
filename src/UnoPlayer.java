import java.util.ArrayList;
import java.util.List;

public class UnoPlayer {
    public final String name;

    public List<UnoCard> hand = new ArrayList<>();


    public UnoPlayer(String name) {
        this.name = name;
    }
}
