package ru.flendger.patterns.prototype;

import java.util.Objects;

public abstract class MyAbstractPrototype implements Cloneable {
    private String value;

    public MyAbstractPrototype() {
    }

    public MyAbstractPrototype(MyAbstractPrototype source) {
        if (source != null) {
            this.value = source.value;
        }
    }

    @Override
    public abstract MyAbstractPrototype clone();

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyAbstractPrototype that = (MyAbstractPrototype) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
