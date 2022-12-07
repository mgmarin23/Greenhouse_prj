package dte.masteriot.mdp.greenhouse_prj;

public class Item {
    // This class contains the actual data of each item of the dataset

    private String title;
    private int nideas;
    private Long key; // In this app we use keys of type Long
    private boolean status;

    private int image;
    private String stringURI;

    //Item(String title, String stringURI, String subtitle, Long key, int image, boolean status) {
        Item(String title, String stringURI, int nideas, Long key, int image , boolean status) {
        this.title = title;
        this.nideas = nideas;
        this.key = key;
        this.image = image;
        this.stringURI = stringURI;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public int getNideas() {
        return nideas;
    }

    public Long getKey() {
        return key;
    }

    public int getImage(){ return image;}

    public String getStringURI(){ return stringURI; }

    public boolean getStatus(){return status; }

    // We override the "equals" operator to only compare keys
    // (useful when searching for the position of a specific key in a list of Items):
    public boolean equals(Object other) {
        return this.key == ((Item) other).getKey();
    }

}