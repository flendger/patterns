package ru.flendger.patterns.adapter;

public class DocumentConverterImp implements DocumentsConverter{
    private final JSONConverter jsonConverter;

    public DocumentConverterImp(JSONConverter jsonConverter) {
        this.jsonConverter = jsonConverter;
    }

    @Override
    public void analyzeXML(String xml) {
        System.out.println("Convert xml to json: " + xml);
        jsonConverter.workWithDoc("json from xml: " + xml);
    }

    @Override
    public String getFullXML(String xml) {
        System.out.println("Convert xml to json: " + xml);
        String json = jsonConverter.buildDoc("json from xml: " + xml);
        System.out.println("Convert xml from json: " + json);

        return "xml from json: " + json;
    }
}
