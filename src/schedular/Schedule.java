package schedular;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<AbstractEvent> events = new ArrayList<>();
    public void add(AbstractEvent event) {
        this.events.add(event);
    }

    public void printBy(EventType type) {
        events.stream().filter(event -> event.support(type))
                .forEach(Event::print);
    }

    public void printAll() {
        events.forEach(Event::print);
    }
}
