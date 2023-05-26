public class Main{
    public static void main(String[] args) {
        Utente pietro = new Utente(1,"Magixbox");
        Utente ciccio = new Utente(2,"CHiccoman");
        Utente mauro = new Utente(3,"Mauri chi?");
        Utente giggino = new Utente(4,"Io sono il team leader");
        Utente angelica = new Utente(5,"daje cazz");
        Videogioco marioKart = new Videogioco(1,"Mario Kart",3);
        Videogioco willyIlCojote = new Videogioco(1,"Willy il Cogliote",1);
        Videogioco zelda = new Videogioco(1,"Zelda",2);
        Videogioco worldOfWarcraft = new Videogioco(1,"World of Warcraft",5);
        Videogioco ironMarine = new Videogioco(1,"Iron Marine",4);
        marioKart.addUtente(pietro,200);
        marioKart.addUtente(giggino,150);
        marioKart.addUtente(angelica,50);
        willyIlCojote.addUtente(ciccio,300);
        willyIlCojote.addUtente(mauro,150);
        zelda.addUtente(mauro,75);
        zelda.addUtente(giggino,100);
        zelda.addUtente(angelica,200);
        worldOfWarcraft.addUtente(angelica,550);
        worldOfWarcraft.addUtente(giggino,500);
        worldOfWarcraft.addUtente(ciccio,300);
        ironMarine.addUtente(pietro,440);
        ironMarine.addUtente(ciccio,400);
        worldOfWarcraft.printLocalScore();

        Salagiochi playPark = new Salagiochi()
    }
}