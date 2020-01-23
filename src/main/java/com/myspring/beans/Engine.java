package com.myspring.beans;

public class Engine {
    private String eName;
    private int hp;

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "eName='" + eName + '\'' +
                ", hp=" + hp +
                '}';
    }
}
