package dte.masteriot.mdp.greenhouse_prj;

public class Ideas {
    String name;
    int keyideas;



    Ideas(String name, int keyideas){
        this.name = name;
        this.keyideas = keyideas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKeyideas() {
        return keyideas;
    }

    public void setKeyideas(int keyideas) {
        this.keyideas = keyideas;
    }
}
