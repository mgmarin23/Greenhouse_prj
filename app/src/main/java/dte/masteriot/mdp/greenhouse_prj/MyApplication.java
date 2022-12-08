package dte.masteriot.mdp.greenhouse_prj;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    private static final List<Item> listofitems = new ArrayList<Item>();
    private static final List<Ideas> fetchData = new ArrayList<>();



    private static long nextId = 6;

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

        fetchData.add(new Ideas("a",2));
        fetchData.add(new Ideas("b",2));
        fetchData.add(new Ideas("c",4));
        fetchData.add(new Ideas("d",5));
        fetchData.add(new Ideas("e",4));
        fetchData.add(new Ideas("f",4));
        fetchData.add(new Ideas("g",0));
        fetchData.add(new Ideas("h",0));
        fetchData.add(new Ideas("i",0));
        fetchData.add(new Ideas("j",1));
        fetchData.add(new Ideas("k",1));
        fetchData.add(new Ideas("l",3));
        fetchData.add(new Ideas("m",3));
        fetchData.add(new Ideas("n",5));
        fetchData.add(new Ideas("ñ",2));
        fetchData.add(new Ideas("o",6));

    }
}

