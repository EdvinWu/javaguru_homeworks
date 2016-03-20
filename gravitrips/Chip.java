package javaguru.gravitrips;

public enum Chip {
    X("X"),
    O("O"),
    EMPTY(".");

    private String name;

    Chip(String name) {
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
