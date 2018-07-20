package com.example.android.testing.uiautomator.BasicSample;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.Until;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class DumpUI {

    private UiDevice mDevice;

    @Before
    public void startMainActivityFromHomeScreen() {
        // Initialize UiDevice instance
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    }

    @Test
    public void checkPreconditions() {
        assertThat(mDevice, notNullValue());
    }

    @Test
    public void dump(){

        System.out.print("start..........");

        try {
            mDevice.dumpWindowHierarchy(new File("/mnt/sdcard/window_dump.uix"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            boolean ret = mDevice.takeScreenshot(new File("/mnt/sdcard/window_dump.png"));
            if(ret){
                System.out.print("ok..screenshot");
            }else{
                System.out.print("err..screenshot");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.print("done..........");
    }
}
