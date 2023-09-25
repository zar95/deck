import java.util.Random;

public class Deck {

    private Cards[] cards = new Cards[52];

    String[] suits = {"clubs", "hearts", "diamonds", "spades"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    Deck() {
        int counter = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {

                cards[counter++] = new Cards(suits[j],ranks[i]);
            }
        }
    }

  public  String toString(){
        StringBuilder str = new StringBuilder();
        for (int i=0; i<52 ; i++)
            str.append(cards[i] + "\n");
        return str.toString();
  }

  public void shuffle(){

      Random random = new Random();
      for (int i =  0 ; i < 6000 ; i++) {
          int randomIndex = random.nextInt(52);
          Cards temp = cards[randomIndex];
          cards[randomIndex] = cards[0];
          cards[0] = temp;
      }
  }

  private Cards[] p1 = new Cards[13];
Deck() {
    int total = 0;
    for (int i = 0; i < 13; i++) {
            p1[total++] = cards[i];

    }
}

}

