package com.example.android.miwokdictionary;


public class Word {

    //TODO defaultTranslation to become int and take resource from strings.xml
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId;


    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        this(defaultTranslation, miwokTranslation);
        this.imageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return this.defaultTranslation;
    }

    public String getMiwokTranslation() {
        return this.miwokTranslation;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }


}
