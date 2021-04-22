package ru.flendger.patterns.prototype;

import java.util.Objects;

public class PrototypeR extends MyAbstractPrototype{
    private String r;

    public PrototypeR() {
    }

    public PrototypeR(PrototypeR source) {
        super(source);
        if (source != null) {
            this.r = source.r;
        }
    }

    @Override
    public MyAbstractPrototype clone() {
        return new PrototypeR(this);
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PrototypeR that = (PrototypeR) o;
        return Objects.equals(r, that.r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), r);
    }
}
