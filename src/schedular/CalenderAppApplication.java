package schedular;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CalenderAppApplication {
    public static void main(String[] args) {
        HashSet<String> participants = new HashSet<String>();
        participants.add("Kim");
        participants.add("Danny");

        List<AbstractEvent> list = new ArrayList<>();
        Meeting meeting1 = new Meeting(1, "모각코", ZonedDateTime.now(), ZonedDateTime.now().plusHours(2),
               participants , "room1", "코딩");

        list.add(meeting1);

    }
}
