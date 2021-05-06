package com.group_f;

public class Main {

    public static void main(String[] args) {

        SpreadSheetReader read1 = new Gsheets();
        SpreadSheetReader read2 = new Xls();
        SpreadSheetReader read3 = new Numbers();
        SpreadSheetReader read4 = new Qbw();

        read1.ReadNext(read2);
        read2.ReadNext(read3);
        read3.ReadNext(read4);

        FileReader reader = new FileReader(".gsheet");

        read1.FileReader(reader);
    }
}
