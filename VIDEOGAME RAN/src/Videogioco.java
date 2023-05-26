import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Videogioco {
    private int id;
    private String name;
    private int difficultyCoefficient;
    private Map<Utente, Integer> localScore;

    public Videogioco(int id, String name, int difficultyCoefficient) {
        this.id = id;
        this.name = name;
        this.difficultyCoefficient = difficultyCoefficient;
        this.localScore = new HashMap<>();
    }

    public Map<Utente, Integer> localScore() {
        return localScore;
    }

    public void setLocalScore(Map<Utente, Integer> localScore ) {
        this.localScore = localScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficultyCoefficient() {
        return difficultyCoefficient;
    }

    public void setDifficultyCoefficient(int difficultyCoefficient) {
        this.difficultyCoefficient = difficultyCoefficient;
    }

    public void addUtente(Utente x, Integer score) {
        localScore.put(x, score);
    }

    public void printLocalScore() {  //dopo stream posso mettere sorted ma mi da errore
        Map<String, Integer> result2 = new LinkedHashMap<>();
        localScore.entrySet().stream()
                .sorted(Map.Entry.<Utente, Integer>comparingByValue().reversed()).limit(3)
                .forEachOrdered(x -> result2.put(x.getKey().getname(), x.getValue()));
        System.out.println(result2);
    }
}
//List<String> keys = hm.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3).map(Map.Entry::getKey).collect(Collectors.toList());
//System.out.println(localScore.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue()));

//public void printLocalScore() {
//        for (Map.Entry<Utente, Integer> entry : localScore.entrySet()) {
//            System.out.println(entry.getKey().getId() + "/" + entry.getValue());
//        }
//    }