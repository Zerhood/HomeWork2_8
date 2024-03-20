package skypro.repository;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
@SessionScope
public class Basket {
    private List<Integer> list;

    public Basket() {
        list = new ArrayList<>();
    }
}