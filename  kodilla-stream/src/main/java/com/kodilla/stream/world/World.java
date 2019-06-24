package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;
import com.kodilla.stream.sand.SandStorage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class World {


    public  final List<Continent> world = new ArrayList<>();

    public void addContinent(Continent continent){
        world.add(continent);
    }


    public BigDecimal getPeopleQuantity (){

    return world.stream().flatMap(continent -> continent.getCountries().stream()
    ).map(Country::getPeopleQuantity).reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
