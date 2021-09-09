package com.example.trasulationapp;

public class wordForFamily {
    private String mMakowFamily;
    private String mEnglishFamily;
    private int mImageTranslution;
    private int maudiotranslution;


    public wordForFamily(String MakowFamily,String EnglishFamily,int ImageTranslution,int audiotranslution){
        mMakowFamily = MakowFamily;
        mEnglishFamily = EnglishFamily;
        mImageTranslution = ImageTranslution;
        maudiotranslution = audiotranslution;
    }


    public String getmMakowFamily() {
        return mMakowFamily;
    }

    public String getmEnglishFamily() {
        return mEnglishFamily;
    }

    public int getmImageTranslution() { return mImageTranslution; }

    public int getMaudiotranslution(){ return maudiotranslution; }
}

