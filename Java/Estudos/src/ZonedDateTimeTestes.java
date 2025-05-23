import java.time.ZoneId;
import java.util.Map;

public class ZonedDateTimeTestes {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);

        System.out.println(ZoneId.systemDefault());
    }
}
