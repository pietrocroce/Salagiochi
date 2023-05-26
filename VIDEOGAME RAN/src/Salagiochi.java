import java.util.List;
import java.util.Map;

public class Salagiochi {
    private Map<Utente,Videogioco> classifica;

    public Salagiochi(Map<Utente, Videogioco> classifica) {
        this.classifica = classifica;
    }

    public Map<Utente, Videogioco> getClassifica() {
        return classifica;
    }

    public void setClassifica(Map<Utente, Videogioco> classifica) {
        this.classifica = classifica;
    }

    /*public void addPlayerToGlobalScore(Utente y,Integer x) {
                Integer totalScore = null;
                x = totalScore;
                totalScore = classifica.values().stream().mapToInt(Integer::intValue).sum();
                //persons.values().stream().mapToInt(Integer::intValue).sum();
            }
            public void addGametoTheList(Videogioco x){
                gamelist.add(x);
            }
            */
    public void addUtenteToRanking(Utente x){
        classifica.put(x, 0);
    }
    public void addGameToRanking(Videogioco y){
        classifica.put();
    }
    public void printGlobalScore() {
        Integer totalScore=0;
        for (Videogioco x : gamelist) {
           x.localScore().values();
           for(Utente y : utentelist){
               y.getname();
           }
        }
    }


}

