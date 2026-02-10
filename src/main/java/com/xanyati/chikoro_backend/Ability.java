package com.xanyati.chikoro_backend;

public record Ability(
    String passiveAbility,
    String mainAbility,
    String ultimateAbilityString,
    Boolean isUpgraded
) {}
