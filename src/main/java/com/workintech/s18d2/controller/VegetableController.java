package com.workintech.s18d2.controller;
import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/vegetables")
@Validated
@RestController
@AllArgsConstructor
public class VegetableController {
    private final VegetableService vegetableService;
    // Bu genelde bir service olur.

    @GetMapping
    public List<Vegetable> get() {
        return vegetableService.getByPriceAsc();
    }

    @GetMapping("/desc")
    public List<Vegetable> getDesc() {
        return vegetableService.getByPriceDesc();
    }

    @GetMapping("/{id}")
    public Vegetable getId(@PathVariable long id) {
        return vegetableService.getById(id);
    }

    @PostMapping
    public Vegetable save(@RequestBody Vegetable vegetable) {
        return vegetableService.save(vegetable);
    }

    @PostMapping("/{name}")
    public List<Vegetable> searchVegetables(@PathVariable String name) {
        return vegetableService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public Vegetable delete(@PathVariable long id) {
        return vegetableService.delete(id);
    }
}
