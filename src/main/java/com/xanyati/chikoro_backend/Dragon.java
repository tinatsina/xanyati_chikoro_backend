package com.xanyati.chikoro_backend;

import java.util.UUID;

public record Dragon(
    UUID id,
    String name,
    Ability ability,
    Element element,
    Integer age,
    Double power,
    Boolean inTune
) {}
