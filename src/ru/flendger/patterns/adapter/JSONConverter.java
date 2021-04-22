package ru.flendger.patterns.adapter;

public interface JSONConverter {
    String buildDoc(String json);
    void workWithDoc(String json);
}
