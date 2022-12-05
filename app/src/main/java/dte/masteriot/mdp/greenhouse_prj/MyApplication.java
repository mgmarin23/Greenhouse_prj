package dte.masteriot.mdp.greenhouse_prj;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    private static final List<Item> listofitems = new ArrayList<Item>();
    private static final List<Ideas> fetchData = new ArrayList<>();


    public static List<Item> getListofitems(){
        return listofitems;
    }
    public static List<Ideas> getFetchData(){
        return fetchData;
    }

    public MyApplication(){
        initListOfItems();
        initListOfIdeas();
    }

    private void initListOfItems () {

        listofitems.add(new Item("Burrito Tierra", "https://www.tierraburritos.com/", "Mejicano" , (long) 0 , R.drawable.tierra, true ));
        listofitems.add(new Item("80 grados", "https://ochentagrados.com/", "Tradicional" , (long) 1 , R.drawable._0grados , false ));
        listofitems.add(new Item("La musa", "https://grupolamusa.com/restaurante-musa-malasana/", "Tapas" , (long) 2 , R.drawable.lamusa , true ));
        listofitems.add(new Item("La mejor hamburguesa", "https://lamejorhamburguesa.com/", "Hamburguesa" , (long) 3 , R.drawable.lamejorhamaburguesa , false ));
        listofitems.add(new Item("Sublime", "https://www.sublimeworldrestaurant.com//", "Hamburguesa" , (long) 4 , R.drawable.sublime, true ));
        listofitems.add(new Item("El 2 de Fortuny", "https://www.loscervecistas.es/locales-cervecistas/el-2-de-fortuny/", "Tradicional" , (long) 5 , R.drawable.el2defortuny , true ));
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

    }
}

