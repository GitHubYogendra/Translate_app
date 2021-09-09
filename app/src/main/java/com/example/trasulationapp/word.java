package com.example.trasulationapp;

public class word {
    private String mDefaultTranslution;
    private String mmiwokTranslution;
    private int mImageTranslution;
    private int maudiotranslution;

    public word(String defaultTranslution,String miwokTranslution,int ImageTranslution,int audiotranslution){
        mDefaultTranslution = defaultTranslution;
        mmiwokTranslution = miwokTranslution;
        mImageTranslution = ImageTranslution;
        maudiotranslution = audiotranslution;
    }

    public String getmDefaultTranslution() {
        return mDefaultTranslution;
    }

    public String getMmiwokTranslution() {
        return mmiwokTranslution;
    }

    public int getmImageTranslution() {
        return mImageTranslution;
    }

    public int getMaudiotranslution() {
        return maudiotranslution;
    }
}
