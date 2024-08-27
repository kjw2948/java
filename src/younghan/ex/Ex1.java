package younghan.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        for (Icon icon : Icon.values()) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(icon, i));
            }
        }
        Collections.shuffle(deck);
        int start = 0;


        Player player1 = new Player(deck.subList(start, start+5));
        start += 5;
        Player player2 = new Player(deck.subList(start, start+5));

        System.out.println("플레이어1의 카드 : " + player1.printDeck() + "합계: "+ player1.getTotal());
        System.out.println("플레이어2의 카드 : " + player2.printDeck() + "합계: "+ player2.getTotal());
        if (player1.getTotal() > player2.getTotal()) {
            System.out.println("플레이어1의 승리");
        } else if (player1.getTotal() < player2.getTotal()) {
            System.out.println("플레이어2의 승리");
        } else {
            System.out.println("무승부");
        }
    }


    static class Player {
        List<Card> playerDeck = new ArrayList<>();
        int total = 0;

        Player(List<Card> playerDeck) {
            this.playerDeck = playerDeck;
            Collections.sort(playerDeck);
        }

        public String printDeck() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            int count = 0;
            for (Card card : playerDeck) {
                count ++;
                sb.append(card.getNumber());
                sb.append("(").append(card.getIcon().getIcon()).append(")");
                if (count < 5) {
                    sb.append(", ");
                }
            }
            sb.append("], ");
            return sb.toString();
        }

        public int getTotal() {
            for (Card card : playerDeck) {
                total += card.getNumber();
            }
            return total;
        }

    }

}
