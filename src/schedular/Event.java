package schedular;

public interface Event {
    public void print();

    public boolean support(EventType eventType);
}
