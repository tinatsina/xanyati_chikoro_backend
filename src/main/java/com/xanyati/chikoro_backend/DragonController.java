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

            new Ability("Lava","Firey Blow", "Glorious Blaze", false),
            Element.FIRE,
            23,
            99.9,
            false));

        dragonList.add(
            new Dragon(UUID.randomUUID(),
            "Flameheart",
            new Ability("Fireball","Flame Breath", "Inferno", true),
            Element.FIRE,
            25,
            98.5,
            true));

        dragonList.add(
            new Dragon(UUID.randomUUID(),
            "Icefang",
            new Ability("Frostbite","Ice Breath", "Blizzard", true),
            Element.WATER,
            27,
            97.2,
            false));

        dragonList.add(
            new Dragon(UUID.randomUUID(),
            "Thunderstrike",
            new Ability("Lightning","Thunderous Roar", "Thunderstorm", true),
            Element.EARTH,
            29,
            96.8,
            true));

        dragonList.add(
            new Dragon(UUID.randomUUID(),
            "Shadowwing",
            new Ability("Shadowstrike","Dark Breath", "Shadowstorm", true),
            Element.VOID,
            31,
            95.6,
            false));

    }

    @GetMapping("/")
    public List<Dragon> getDragonList() {
        return dragonList;
    }

}
