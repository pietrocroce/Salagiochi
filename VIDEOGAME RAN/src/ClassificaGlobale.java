
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class  ClassificaGlobale {
    private LinkedHashMap<Utente, Integer> classificaGlobale = new LinkedHashMap<>();

    public LinkedHashMap<Utente, Integer> getClassificaGlobale() {
        return classificaGlobale;
    }

    public void setClassificaGlobale(LinkedHashMap<Utente, Integer> classificaGlobale) {
        this.classificaGlobale = classificaGlobale;
    }
}
