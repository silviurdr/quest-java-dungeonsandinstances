package com.codecool.quest.logic;

import com.codecool.quest.logic.actors.Skeleton;

public enum CellType {
    EMPTY("empty"),
    FLOOR("floor"),
    WALL("wall"),
    WEAPON("weapon"),
    KEY("key"),
    HELMET("helmet");



    private final String tileName;

    CellType(String tileName) {
        this.tileName = tileName;
    }

    public String getTileName() {
        return tileName;
    }
}
