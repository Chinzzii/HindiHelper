package com.example.android.hindihelper;

public class Word2 {

    private String englishWord;
    private String hindiWord;
    private String numWord;

    public Word2(String en, String in, String num) {
        englishWord = en;
        hindiWord = in;
        numWord = num;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getHindiWord() {
        return hindiWord;
    }

    public String getNumWord() {
        return numWord;
    }
}