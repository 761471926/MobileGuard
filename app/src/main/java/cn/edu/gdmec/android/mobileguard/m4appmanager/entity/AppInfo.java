package cn.edu.gdmec.android.mobileguard.m4appmanager.entity;


import android.graphics.drawable.Drawable;

/**
 * Created by student on 17/11/6.
 */

public class AppInfo {
    public String packageName;
    public Drawable icon;
    public String appName;
    public String apkPath;
    public long appSize;
    public boolean isInRoom;
    public boolean isUserApp;
    public boolean isSelected = false;
    public String versionName;
    public long firstInstallTime;
    public String signature;
    public String requestedPermissions;

    public String getAppLocation(boolean isInRoom) {
        if (isInRoom) {
            return "手机内存";
        } else {
            return "外部存储";
        }
    }
}
