package com.structural.patterns.compositePattern;

public class Driver {
    public static void main(String[] args) {

        Directory mainDirectory = new Directory();
        FileSystem file1 = new File("abc.txt");
        mainDirectory.addFiles(file1);

        Directory childDirectory = new Directory();
        FileSystem file2 = new File("xyz.txt");
        childDirectory.addFiles(file2);

        mainDirectory.addFiles(childDirectory);

        mainDirectory.ls();;

    }
}
