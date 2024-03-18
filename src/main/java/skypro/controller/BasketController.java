package skypro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.service.BasketService;

import java.util.Collection;
import java.util.List;

@RestController
public class BasketController {

    private BasketService service;

    public BasketController(BasketService service) {
        this.service = service;
    }

    @GetMapping(value = "/add", params = {"integers"})
    public void add(@RequestParam(value = "integers", required = false) List<Integer> integers) {
        service.add(integers);
    }

    @GetMapping("/get")
    public Collection<Integer> get() {
        return service.get();
    }
}