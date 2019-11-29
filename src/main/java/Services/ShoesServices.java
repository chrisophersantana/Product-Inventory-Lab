package Services;

import Models.Shoes;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ShoesServices {

    private  int nextId = 1;

        private ArrayList<Shoes> inventory = new ArrayList<>();

public Shoes create(String Name,String Brand, String Sport, int Size, int Qunatity, double Price) {
    Shoes createShoe = new Shoes(nextId++, Name, Brand, Size, Sport, Qunatity, Price);

inventory.add(createShoe);

return createShoe;


}


    public Shoes findShoes(int id) {

    for(Shoes s : inventory){
        if(s.getId()== id){
            return s;
        }
    }
    return null;

    }


    public Shoes[] findAll() {
    return inventory.toArray(new Shoes[0]);

    }


    public boolean delete(int id) {
    return inventory.remove(findShoes(id));

    }



}




