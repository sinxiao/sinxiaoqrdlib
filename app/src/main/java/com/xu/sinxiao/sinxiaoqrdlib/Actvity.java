package com.xu.sinxiao.sinxiaoqrdlib;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ae.sinxiao.android.qrd.ScanQrdActivity;
import ae.sinxiao.android.qrd.model.QrdScanResult;

public class Actvity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScanQrdActivity.startScanQrdActivity(getApplicationContext(), new ScanQrdActivity.ScanListener() {
            @Override
            public void onScanSucess(QrdScanResult scanResult) {

            }

            @Override
            public void onScanFail(String msg) {

            }

            @Override
            public void onScanCancled() {

            }
        });
    }
}
