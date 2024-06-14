package com.thoughtworks.wallet;

public class Rupee {
    private final double value;
    public Rupee(double rupee) throws Exception {
        if(rupee < 0) {
            throw new Exception();
        }
        this.value = rupee;
    }
    public Rupee add(Rupee rupee) throws Exception {
        return new Rupee(value + rupee.value);
    }
    @Override
    public boolean equals(Object rupee) {
        if(rupee == null || (rupee.getClass() != Rupee.class)) {
            return false;
        } else if(rupee == this) {
            return true;
        }
        return this.value == ((Rupee) rupee).value;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
