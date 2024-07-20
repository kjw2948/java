package schedular;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<AbstractEvent> events = new ArrayList<>();
    public void add(AbstractEvent event) {
        if(hasScheduleConflictWith(event)){
            return;
        }
        this.events.add(event);
    }

    public void printBy(EventType type) {
        events.stream().filter(event -> event.support(type))
                .forEach(Event::print);
    }

    public void printAll() {
        events.forEach(Event::print);

    }

    private boolean hasScheduleConflictWith(AbstractEvent event) {
        return events.stream()
                .anyMatch(each ->
                        (event.getStartAt().isAfter(each.getStartAt()) && event.getStartAt().isBefore(each.getEndAt()))
                                || (event.getEndAt().isBefore(each.getEndAt()) && event.getEndAt().isAfter(each.getStartAt())));
    }
}
