package FurnitureShop;
import FurnitureShop.Materials.*;
import FurnitureShop.Order.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<String, Integer> request = new HashMap<>();
        AssemblyShop assemblyShop = new AssemblyShop();
        BilletShop billetShop = new BilletShop((double)20);
        assemblyShop.setItems(Arrays.asList(new Kitchen(),
                                            new Dresser(),
                                            new Wardrobe(),
                                            new ChairGood(),
                                            new ChairBad()));

        billetShop.setMaterials(Arrays.asList(new Board(),
                                              new Beam(),
                                              new Plate(),
                                              new Dowel()
                                              ));

        Consumer consumer = new Consumer(100000);
        request.put("Кухня", 1);
        request.put("Шкаф", 1);
        request.put("Тумба", 1);
        request.put("Табурет хороший", 1);
        consumer.requestOrder(request, assemblyShop, billetShop);
    }
}
