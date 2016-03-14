package javaguru_homeworks.Gravitrips_pack;

/**
 * Created by Edwin on 2016.03.13..
 */
public enum Chips {
    X("X"),
    O("O"),
    EMPTY(".");

    private String name;

    Chips(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
