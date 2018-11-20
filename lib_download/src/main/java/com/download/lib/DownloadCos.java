package com.download.lib;

import android.os.Environment;

/**
 * @author zwl
 * @describe 下载常量
 * @date on 2018/11/16
 */
public class DownloadCos {

    public static final String LOG_TAG = "download";

    public static final String DB_NAME = "download.db";//数据库名称
    public static final String TB_NAME = "download_info";//表名称

    public static final String FILEPATH = Environment.getExternalStorageDirectory()
            .getAbsolutePath() + "/DCIM/Camera";//文件路径

}
