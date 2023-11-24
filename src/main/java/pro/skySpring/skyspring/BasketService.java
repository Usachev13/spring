package pro.skySpring.skyspring;

import java.util.Collection;
import java.util.List;

public interface BasketService {
    List<Integer> add(List<Integer> items);

    Collection<Integer> get();
}
