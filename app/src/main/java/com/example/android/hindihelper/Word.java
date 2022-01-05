package com.example.android.hindihelper;

public class Word {

    private String englishWord;
    private String hindiWord;
    private int imageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String en, String in, int imageId) {
        englishWord = en;
        hindiWord = in;
        imageResourceId = imageId;
    }

    public Word(String en, String in) {
        englishWord = en;
        hindiWord = in;
    }

    public boolean hasImage() { return imageResourceId != NO_IMAGE; }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getHindiWord() {
        return hindiWord;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }
}
