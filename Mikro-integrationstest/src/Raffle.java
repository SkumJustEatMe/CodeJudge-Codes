public class Raffle {

    public int kast() {
        Die terning = new Die();
        int terning1 = terning.roll();
        int terning2 = terning.roll();
        int resultat = terning1 + terning2;
        return resultat;
    }
}
