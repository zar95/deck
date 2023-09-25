public class Cards {

    final String suits;
    final  String ranks;

    public String getSuits() {
        return suits;
    }

    public String getRanks() {
        return ranks;
    }

    public Cards(String suits, String ranks) {
        this.suits = suits;
        this.ranks = ranks;
    }
public String toString(){
        return String.format("%s of %s",this.ranks,this.suits);
}
}
