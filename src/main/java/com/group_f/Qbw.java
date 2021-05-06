package com.group_f;

public class Qbw implements SpreadSheetReader {

    private SpreadSheetReader readNext;

    @Override
    public void ReadNext(SpreadSheetReader readNext){

        this.readNext = readNext;
    }
    @Override
    public void FileReader(FileReader readFile) {

        if (readFile.getRead().endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
        } else {
            throw new UnsupportedOperationException("File format not supported.Lul");
        }
    }
}
