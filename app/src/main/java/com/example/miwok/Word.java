package com.example.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiworkTranslation;

    private int mImageResourceId = No_Image_Provided;

    private static final int No_Image_Provided = -1;

    public Word(String defaultTranslation, String miworkTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
    }

    public Word(String defaultTranslation, String miworkTranslation, int imageResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mImageResourceId = imageResourceId;
    }


    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }


    public String getMiworkTranslation(){
        return mMiworkTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return  mImageResourceId != No_Image_Provided;
    }

}
