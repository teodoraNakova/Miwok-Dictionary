package com.example.android.miwokdictionary;


public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Word(int defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(int defaultTranslation, String miwokTranslation, int imageResourceId) {
        this(defaultTranslation, miwokTranslation);
        mImageResourceId = imageResourceId;
    }

    public int getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
