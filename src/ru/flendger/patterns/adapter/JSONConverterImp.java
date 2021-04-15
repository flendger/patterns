package ru.flendger.patterns.adapter;

public class JSONConverterImp implements JSONConverter{
    @Override
    public String buildDoc(String json) {
        System.out.println("Getting full json: " + json);
        return "JSON result: " + json;
    }

    @Override
    public void workWithDoc(String json) {
        System.out.println("Analyzing: " + json);
    }
}
