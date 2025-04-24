package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.FruitRepository;
import com.workintech.s18d2.entity.Fruit;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;

    @Override
    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    @Override
    public List<Fruit> getByPriceDesc() {
        return List.of();
    }

    @Override
    public Fruit getById(long id) {
        return null;
    }

    @Override
    public Fruit save(Fruit fruit) {
        return null;
    }

    @Override
    public Fruit delete(long id) {
        return null;
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return List.of();
    }
}
