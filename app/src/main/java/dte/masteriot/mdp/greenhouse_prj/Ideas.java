package dte.masteriot.mdp.greenhouse_prj;

public class Ideas {
    String name;
    long keyideas;



    Ideas(String name, long keyideas){
        this.name = name;
        this.keyideas = keyideas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getKeyideas() {
        return keyideas;
    }

    public void setKeyideas(long keyideas) {
        this.keyideas = keyideas;
    }
}
