package com.demo.ndk.diff.server;

public class BsDiff {
    static {
        System.loadLibrary("BsdiffUpdate");
    }
    public native static int diff(String oldFilePath, String newFilePath, String patchFilePath);
}
