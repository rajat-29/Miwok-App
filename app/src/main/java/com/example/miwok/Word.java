package com.example.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiworkTranslation;

    private int mImageResourceId = No_Image_Provided;

    private static final int No_Image_Provided = -1;

    private int mAudioResourceid;

    public Word(String defaultTranslation, String miworkTranslation, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mAudioResourceid = audioResourceId;
    }

    public Word(String defaultTranslation, String miworkTranslation, int imageResourceId, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceid = audioResourceId;
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

    public int getmAudioResourceid() {
        return  mAudioResourceid;
    }

}
