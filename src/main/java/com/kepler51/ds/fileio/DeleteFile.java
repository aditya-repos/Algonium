package com.kepler51.ds.fileio;

import java.io.File;

public class DeleteFile {

    private static void deleteFiles(final String directory){
        if(null == directory)
            throw new IllegalArgumentException("Not a valid directory. Found null");
        File[] files = new File(directory).listFiles();
        for (File file: files){
            String fileName = file.getName();
            if (fileName.contains("clientcertmutualauth")) {
                file.delete();
            }
        }
    }


    public static void main(String[] args) {
        deleteFiles("deleteIt");
    }
}
