package skypro.service;

import org.springframework.stereotype.Service;
import skypro.repository.Basket;

import java.util.Collection;
import java.util.List;

@Service
public class BasketService {
    private Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void add(List<Integer> integers) {
        List<Integer> list = basket.getList();
        list.addAll(integers);
        basket.setList(list);
    }

    public Collection<Integer> get() {
        return basket.getList();
    }
}