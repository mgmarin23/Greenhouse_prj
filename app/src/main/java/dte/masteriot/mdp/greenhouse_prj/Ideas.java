package dte.masteriot.mdp.greenhouse_prj;

public class Ideas {
    String name, description, link;
    long id, keyideas;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    Ideas(long id, String name, long keyideas, String description, String link, boolean star , boolean done){
        this.id = id;
        this.name = name;
        this.keyideas = keyideas;
        this.description = description;
        this.link = link;
        this.star = star;
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    boolean star, done;



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
