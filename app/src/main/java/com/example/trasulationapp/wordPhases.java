package com.example.trasulationapp;

public class wordPhases {
    private String mEnglishFamily;
    private String mmiwokTranslution;
    private int maudiotranslution;

    public wordPhases(String EnglishFamily,String miwokTranslution,int audiotranslution){
        mEnglishFamily = EnglishFamily;
        mmiwokTranslution = miwokTranslution;
        maudiotranslution = audiotranslution;
    }

    public String getmEnglishFamily() {
        return mEnglishFamily;
    }

    public String mmiwokTranslution() {
        return mmiwokTranslution;
    }

    public int getMaudiotranslution() {
        return maudiotranslution;
    }

}

