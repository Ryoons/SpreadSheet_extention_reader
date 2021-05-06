package com.group_f;

public class Numbers implements SpreadSheetReader {

    private SpreadSheetReader readNext;

    @Override
    public void ReadNext(SpreadSheetReader readNext){

        this.readNext = readNext;
    }
    @Override
    public void FileReader(FileReader readFile) {

        if (readFile.getRead().endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
        } else {
            readNext.FileReader(readFile);
        }
    }
}
