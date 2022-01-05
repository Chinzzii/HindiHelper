package com.example.android.hindihelper;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word2> numWords = new ArrayList<>();
        numWords.add(new Word2("Zero","Shuniye", "0"));
        numWords.add(new Word2("One","Ek", "1"));
        numWords.add(new Word2("Two","Do", "2"));
        numWords.add(new Word2("Three","Teen", "3"));
        numWords.add(new Word2("Four","Chaar", "4"));
        numWords.add(new Word2("Five","Paanch", "5"));
        numWords.add(new Word2("Six","Cheh", "6"));
        numWords.add(new Word2("Seven","Saat", "7"));
        numWords.add(new Word2("Eight","Aath", "8"));
        numWords.add(new Word2("Nine","Nao", "9"));
        numWords.add(new Word2("Ten","Das", "10"));
        numWords.add(new Word2("Eleven","Gyaarah", "11"));
        numWords.add(new Word2("Twelve","Baarah", "12"));
        numWords.add(new Word2("Thirteen","Tehrah", "13"));
        numWords.add(new Word2("Fourteen","Chaudah", "14"));
        numWords.add(new Word2("Fifteen","Pandrah", "15"));
        numWords.add(new Word2("Sixteen","Saulah", "16"));
        numWords.add(new Word2("Seventeen","Satrah", "17"));
        numWords.add(new Word2("Eighteen","Atharah", "18"));
        numWords.add(new Word2("Nineteen","Unnis", "19"));
        numWords.add(new Word2("Twenty","Bees", "20"));
        numWords.add(new Word2("Twenty One","Ikis", "21"));
        numWords.add(new Word2("Twenty Two","Bais", "22"));
        numWords.add(new Word2("Twenty Three","Teis", "23"));
        numWords.add(new Word2("Twenty Four","Chaubis", "24"));
        numWords.add(new Word2("Twenty Five","Pachis", "25"));
        numWords.add(new Word2("Twenty Six","Chabis", "26"));
        numWords.add(new Word2("Twenty Seven","Satais", "27"));
        numWords.add(new Word2("Twenty Eight","Athais", "28"));
        numWords.add(new Word2("Twenty Nine","Unatis", "29"));
        numWords.add(new Word2("Thirty","Tis", "30"));
        numWords.add(new Word2("Thirty One","Ikatis", "31"));
        numWords.add(new Word2("Thirty Two","Batis", "32"));
        numWords.add(new Word2("Thirty Three","Tentis", "33"));
        numWords.add(new Word2("Thirty Four","Chautis", "34"));
        numWords.add(new Word2("Thirty Five","Pentis", "35"));
        numWords.add(new Word2("Thirty Six","Chatis", "36"));
        numWords.add(new Word2("Thirty Seven","Setis", "37"));
        numWords.add(new Word2("Thirty Eight","Adhtis", "38"));
        numWords.add(new Word2("Thirty Nine","Untaalis", "39"));
        numWords.add(new Word2("Forty","Chalis", "40"));
        numWords.add(new Word2("Forty One","Iktalis", "41"));
        numWords.add(new Word2("Forty Two","Byalis", "42"));
        numWords.add(new Word2("Forty Three","Tetalis", "43"));
        numWords.add(new Word2("Forty Four","Chavalis", "44"));
        numWords.add(new Word2("Forty Five","Pentalis", "45"));
        numWords.add(new Word2("Forty Six","Chyalis", "46"));
        numWords.add(new Word2("Forty Seven","Setalis", "47"));
        numWords.add(new Word2("Forty Eight","Adtalis", "48"));
        numWords.add(new Word2("Forty Nine","Unachas", "49"));
        numWords.add(new Word2("Fifty","Pachas", "50"));
        numWords.add(new Word2("Fifty One","Ikyavan", "51"));
        numWords.add(new Word2("Fifty Two","Baavan", "52"));
        numWords.add(new Word2("Fifty Three","Tirepan", "53"));
        numWords.add(new Word2("Fifty Four","Chauvan", "54"));
        numWords.add(new Word2("Fifty Five","Pachpan", "55"));
        numWords.add(new Word2("Fifty Six","Chappan", "56"));
        numWords.add(new Word2("Fifty Seven","Satavan", "57"));
        numWords.add(new Word2("Fifty Eight","Athaavan", "58"));
        numWords.add(new Word2("Fifty Nine","Unsadh", "59"));
        numWords.add(new Word2("Sixty","Saadh", "60"));
        numWords.add(new Word2("Sixty One","Iksadh", "61"));
        numWords.add(new Word2("Sixty Two","Baasad", "62"));
        numWords.add(new Word2("Sixty Three","Tirsadh", "63"));
        numWords.add(new Word2("Sixty Four","Chausadh", "64"));
        numWords.add(new Word2("Sixty Five","Pensadh", "65"));
        numWords.add(new Word2("Sixty Six","Chiyasadh", "66"));
        numWords.add(new Word2("Sixty Seven","Sadhsadh", "67"));
        numWords.add(new Word2("Sixty Eight","Asdhsadh", "68"));
        numWords.add(new Word2("Sixty Nine","Unahtar", "69"));
        numWords.add(new Word2("Seventy","Sattar", "70"));
        numWords.add(new Word2("Seventy One","Ikahtar", "71"));
        numWords.add(new Word2("Seventy Two","Bahatar", "72"));
        numWords.add(new Word2("Seventy Three","Tihatar", "73"));
        numWords.add(new Word2("Seventy Four","Chauhatar", "74"));
        numWords.add(new Word2("Seventy Five","Pachhatar", "75"));
        numWords.add(new Word2("Seventy Six","Chiyahatar", "76"));
        numWords.add(new Word2("Seventy Seven","Satahatar", "77"));
        numWords.add(new Word2("Seventy Eight","Adhahatar", "78"));
        numWords.add(new Word2("Seventy Nine","Unnasi", "79"));
        numWords.add(new Word2("Eighty","Assi", "80"));
        numWords.add(new Word2("Eighty One","Ikyasi", "81"));
        numWords.add(new Word2("Eighty Two","Byaasi", "82"));
        numWords.add(new Word2("Eighty Three","Tirasi", "83"));
        numWords.add(new Word2("Eighty Four","Chaurasi", "84"));
        numWords.add(new Word2("Eighty Five","Pachasi", "85"));
        numWords.add(new Word2("Eighty Six","Chiyaasi", "86"));
        numWords.add(new Word2("Eighty Seven","Sataasi", "87"));
        numWords.add(new Word2("Eighty Eight","Athasi", "88"));
        numWords.add(new Word2("Eighty Nine","Nauasi", "89"));
        numWords.add(new Word2("Ninety","Nabbe", "90"));
        numWords.add(new Word2("Ninety One","Ikyaanave", "91"));
        numWords.add(new Word2("Ninety Two","Baanave", "92"));
        numWords.add(new Word2("Ninety Three","Tiranave", "93"));
        numWords.add(new Word2("Ninety Four","Chauraanave", "94"));
        numWords.add(new Word2("Ninety Five","Pachaanave", "95"));
        numWords.add(new Word2("Ninety Six","Chiyaanave", "96"));
        numWords.add(new Word2("Ninety Seven","Sataanave", "97"));
        numWords.add(new Word2("Ninety Eight","Adhaanave", "98"));
        numWords.add(new Word2("Ninety Nine","Ninyaanave", "99"));
        numWords.add(new Word2("One Hundred","Ek Sau", "100"));

        WordAdapter2 adapter = new WordAdapter2(this, numWords);
        ListView listView = (ListView) findViewById(R.id.listNumbers);
        listView.setAdapter(adapter);

    }

}