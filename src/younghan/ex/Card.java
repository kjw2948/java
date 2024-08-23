package younghan.ex;

public class Card implements Comparable<Card>{

    private final Icon icon;
    private int rank;
    private final int number;

    public Card(Icon icon, int number) {
        this.icon = icon;
        this.number = number;
        switch(icon) {
            case Icon.SPADE : this.rank = 1;
                break;
            case Icon.HEART: this.rank = 2;
                break;
            case Icon.DIAMOND: this.rank = 3;
                break;
            case Icon.CLOVER: this.rank = 4;
                break;
        }
    }

    public Icon getIcon() {
        return icon;
    }

    public int getNumber() {
        return number;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card o){
        if (this.getNumber() == o.getNumber()) {
            return Integer.compare(this.getRank(), o.getRank());
        }else{
            return this.getNumber() < o.getNumber() ? -1 : 1;
        }

    }
}
