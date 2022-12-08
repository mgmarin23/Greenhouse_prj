package dte.masteriot.mdp.greenhouse_prj;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    private static final List<Item> listofitems = new ArrayList<Item>();
    private static final List<Ideas> fetchData = new ArrayList<>();



    private static long nextId = 6;

    public static long getNextIdea() {
        return nextIdea;
    }

    public static void setNextIdea(long nextIdea) {
        MyApplication.nextIdea = nextIdea;
    }

    private static long nextIdea = 17;

    public static List<Item> getListofitems(){
        return listofitems;
    }

    public static List<Ideas> getFetchData(){
        return fetchData;
    }
    /*public static void Listofitems(List<Item> listofitems) {
        MyApplication.Listofitems = listofitems;
    }
    public static void setNextId(int nextId) {
        MyApplication.nextId = nextId;
    }
*/
    public MyApplication(){
        initListOfItems();
        initListOfIdeas();
    }

    public static long getNextId() {
        return nextId;
    }

    public static void setNextId(long nextId) {
        MyApplication.nextId = nextId;
    }

    private void initListOfItems () {

        listofitems.add(new Item("Burrito Tierra", "https://www.tierraburritos.com/", 3 , (long) 0 , R.drawable.tierra, true ));
        listofitems.add(new Item("80 grados", "https://ochentagrados.com/", 2 , (long) 1 , R.drawable._0grados , false ));
        listofitems.add(new Item("La musa", "https://grupolamusa.com/restaurante-musa-malasana/", 2 , (long) 2 , R.drawable.lamusa , true ));
        listofitems.add(new Item("La mejor hamburguesa", "https://lamejorhamburguesa.com/", 2 , (long) 3 , R.drawable.lamejorhamaburguesa , false ));
        listofitems.add(new Item("Sublime", "https://www.sublimeworldrestaurant.com//", 2 , (long) 4 , R.drawable.sublime, true ));
        listofitems.add(new Item("El 2 de Fortuny", "https://www.loscervecistas.es/locales-cervecistas/el-2-de-fortuny/", 3 , (long) 5 , R.drawable.el2defortuny , true ));
    }
    private void initListOfIdeas() {

        fetchData.add(new Ideas(0,"a",2,"","",false,false));
        fetchData.add(new Ideas(1,"b",2,"","",false,false));
        fetchData.add(new Ideas(2,"c",4,"","",false,false));
        fetchData.add(new Ideas(3,"d",5,"","",false,false));
        fetchData.add(new Ideas(4,"e",4,"","",false,false));
        fetchData.add(new Ideas(5,"f",4,"","",false,false));
        fetchData.add(new Ideas(6,"g",0,"","",false,false));
        fetchData.add(new Ideas(7,"h",0,"","",false,false));
        fetchData.add(new Ideas(8,"i",0,"","",false,false));
        fetchData.add(new Ideas(9,"j",1,"","",false,false));
        fetchData.add(new Ideas(10,"k",1,"","",false,false));
        fetchData.add(new Ideas(11,"l",3,"","",false,false));
        fetchData.add(new Ideas(12,"m",3,"","",false,false));
        fetchData.add(new Ideas(13,"n",5,"","",false,false));
        fetchData.add(new Ideas(14,"ñ",2,"","",false,false));
        fetchData.add(new Ideas(15,"o",6,"","",false,false));
        fetchData.add(new Ideas(16,"p",2,"","",false,false));

    }
}

