package com.techreturn.mars;

public enum Orientation {
    N, E, S, W;
    private static Orientation[] vals = values();

    public Orientation right(){
        return vals[(this.ordinal()+1) % vals.length];
    }
    public Orientation left(){
        int i = (this.ordinal()-1);
        i = (i != -1) ? (i % vals.length) : vals.length - 1;
        return vals[i];
    }
}
