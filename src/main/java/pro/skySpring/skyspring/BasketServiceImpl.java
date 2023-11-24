package pro.skySpring.skyspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.List;

@SessionScope
@Service
public class BasketServiceImpl implements BasketService{
    @Autowired
    private Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> add(List<Integer> items){
        for (Integer item : items)
            basket.addMarket(item);
        return items;
    }

    @Override
    public Collection<Integer> get(){
        return basket.get();
    }


}
