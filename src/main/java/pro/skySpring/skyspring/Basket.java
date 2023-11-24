package pro.skySpring.skyspring;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Repository
public class Basket {
    private final List<Integer> basketList = new ArrayList<>();

    public List<Integer> addMarket(Integer items){
        basketList.add(items);
        return basketList;
    }

    public Collection<Integer> get() {
        return new ArrayList<>(basketList);
    }
}