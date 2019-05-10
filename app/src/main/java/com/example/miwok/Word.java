package com.example.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiworkTranslation;

    public Word(String defaultTranslation, String miworkTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
    }


    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }


    public String getMiworkTranslation(){
        return mMiworkTranslation;
    }

}
