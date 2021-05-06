package com.group_f;

public class Gsheets implements SpreadSheetReader {

    private SpreadSheetReader readNext;

    @Override
    public void ReadNext(SpreadSheetReader readNext){

        this.readNext = readNext;
    }
    @Override
    public void FileReader(FileReader readFile) {

        if (readFile.getRead().endsWith(".Gsheets")) {
            System.out.println("Reading data from a Google spreadsheet.");
        } else {
            readNext.FileReader(readFile);
        }
    }
}
