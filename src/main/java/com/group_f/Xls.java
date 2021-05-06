package com.group_f;

public class Xls implements SpreadSheetReader {

    private SpreadSheetReader readNext;

    @Override
    public void ReadNext(SpreadSheetReader readNext){

        this.readNext = readNext;
    }
    @Override
    public void FileReader(FileReader readFile) {

        if (readFile.getRead().endsWith(".xls")) {
            System.out.println("Reading data from a Excel spreadsheet.");
        } else {
            readNext.FileReader(readFile);
        }
    }
}
