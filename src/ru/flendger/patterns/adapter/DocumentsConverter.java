package ru.flendger.patterns.adapter;

public interface DocumentsConverter {
    void analyzeXML(String xml);
    String getFullXML(String xml);
}
