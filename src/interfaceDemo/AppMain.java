package interfaceDemo;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydeny Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydeny Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        mappables.add(new UtilityLine("College st", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic blvd", UtilityType.WATER));

        for (var m: mappables) {
            Mappable.mapIt(m);
        }
    }
}
