package younghan.ex;

public enum Icon {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLOVER("♣");

    private final String icon;

    Icon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return this.icon;
    }
}
