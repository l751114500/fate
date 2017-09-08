package com.example.fate.entry.servent;

import java.util.List;

public abstract class Servent {
     
    protected String name;
    protected Integer age;
    protected Double health;
    protected Double mana;
    protected List<NoblePhantasm> nps;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = mana;
    }

    public List<NoblePhantasm> getNps() {
        return nps;
    }

    public void setNps(List<NoblePhantasm> nps) {
        this.nps = nps;
    }

    protected abstract void attack();
}
