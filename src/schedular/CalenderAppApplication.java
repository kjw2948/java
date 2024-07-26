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

        Schedule schedule = new Schedule();
        Meeting meeting1 = new Meeting(1, "모각코", ZonedDateTime.now(), ZonedDateTime.now().plusHours(1),
               participants , "room1", "코딩");
        Meeting meeting2 = new Meeting(3, "테스트", ZonedDateTime.now().plusHours(4), ZonedDateTime.now().plusHours(6),
                participants , "room1", "코딩");
        Meeting meeting3 = new Meeting(4, "테스트2", ZonedDateTime.now().plusHours(4), ZonedDateTime.now().plusHours(6),
                participants , "room2", "코딩2");

        Todo todo = new Todo(2, "코테문제 풀기", ZonedDateTime.now().plusHours(7), ZonedDateTime.now().plusHours(8), "스터디");
        Todo todo2 = new Todo(5, "스프링 공부하기", ZonedDateTime.now().plusHours(7), ZonedDateTime.now().plusHours(8), "스터디");
        schedule.add(meeting1);
        schedule.add(meeting2);
        schedule.add(todo);

        //schedule.printBy(EventType.TO_DO);
        schedule.printAll();
    }
}
