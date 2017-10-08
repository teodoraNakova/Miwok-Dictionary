package com.example.android.miwokdictionary;


public class Word {

    private int defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId;


    public Word(int defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(int defaultTranslation, String miwokTranslation, int imageResourceId) {
        this(defaultTranslation, miwokTranslation);
        this.imageResourceId = imageResourceId;
    }

    public int getDefaultTranslation() {
        return this.defaultTranslation;
    }

    public String getMiwokTranslation() {
        return this.miwokTranslation;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }


}
