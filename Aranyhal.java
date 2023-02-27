package main;

import java.util.HashMap;
import java.util.Map;

public class Aranyhal {
    private static final int KIVANSAGOKSZAMA = 3;
    private int kor;
    private Map map;
    private String kifogta;

    public Aranyhal(String kifogta) {
        this(0,kifogta);
    }

    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        this.kifogta = kifogta;
        //this.map = new HashMap<String,Integer>();
        
        this.map = new HashMap<String,String[]>();
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public int kivansagokSzama(String kifogta){
        return 0;
    }
    public String[] kikkelTalalkozott(){
        String[] lista = new String[]{"asd"};
        return lista;
    }
    public boolean kivansagotTeljesit(String kivansag){
        return true;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kor=" + kor + ", map=" + map + ", kifogta=" + kifogta + '}';
    }
    
}
