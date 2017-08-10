package com.demo.ndk.diff.server;

/**
 * Created by zmq on 2017/8/7.
 */

public class BsDiffTest {
    public static void main(String[] args){
        BsDiff.diff(Const.OLD_APK_PATH, Const.NEW_APK_PATH, Const.PATCH_PATH);
    }
}
