package ru.flendger.patterns.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        DocumentsConverter documentsConverter = new DocumentConverterImp(new JSONConverterImp());
        documentsConverter.analyzeXML("xml for analyzing");
        System.out.println(documentsConverter.getFullXML("xml for getting full version"));
    }
}
