package com.xanyati.chikoro_backend;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DragonController {
    
    private List<Dragon> dragonList;

    public DragonController() {
        dragonList = new ArrayList<>();

        dragonList.add(
            new Dragon(UUID.randomUUID(),
            "Slyrak",
            new Ability("Lava","Firey Blow", "Glorious Blaze", false),
            Element.FIRE,
            23,
            99.9,
            false));
    }

    @GetMapping("/")
    public List<Dragon> getDragonList() {
        return dragonList;
    }
    
}
