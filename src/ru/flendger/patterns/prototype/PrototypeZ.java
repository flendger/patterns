package ru.flendger.patterns.prototype;

import java.util.Objects;

public class PrototypeZ extends MyAbstractPrototype{
    private String x;
    private String z;

    public PrototypeZ() {
    }

    public PrototypeZ(PrototypeZ source) {
        super(source);
        if (source != null) {
            this.x = source.x;
            this.z = source.z;
        }
    }

    @Override
    public MyAbstractPrototype clone() {
        return new PrototypeZ(this);
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PrototypeZ that = (PrototypeZ) o;
        return Objects.equals(x, that.x) && Objects.equals(z, that.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, z);
    }
}
