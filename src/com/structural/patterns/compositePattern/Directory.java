package com.structural.patterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements  FileSystem{
    List<FileSystem> fileSystemList = new ArrayList<>();

    public void addFiles(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        for(FileSystem file: fileSystemList){
            file.ls();;
        }
    }
}
