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
        Meeting meeting2 = new Meeting(3, "테스트", ZonedDateTime.now(), ZonedDateTime.now().plusHours(2),
                participants , "room1", "코딩");

        Todo todo = new Todo(2, "코테문제 풀기", ZonedDateTime.now(), ZonedDateTime.now().plusHours(2), "스터디");
        list.add(meeting1);
        list.add(meeting2);
        list.add(todo);

        list.stream().filter(each -> each.support(EventType.TO_DO))
                .forEach(Event::print);
    }
}
