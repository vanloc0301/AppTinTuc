package com.example.vanloc.apptintuc.common;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by vanloc on 4/19/2016.
 */
public class DataLoadType {

    /**
     * Refresh thành công
     */
    @DataLoadTypeChecker
    public static final int TYPE_REFRESH_SUCCESS = 1;

    @DataLoadTypeChecker
    public static final int TYPE_REFRESH_FAIL = 2;

    @DataLoadTypeChecker
    public static final int TYPE_LOAD_MORE_SUCCESS  = 3;

    @DataLoadTypeChecker
    public static final int TYPE_LOAD_MORE_FAIL = 4;

    /**
     * Chọn các giải phát thay thế, dùng IntDef để chú thích số nguyên và giá trị là 1 hằng số.
     */
    @IntDef({TYPE_REFRESH_SUCCESS, TYPE_REFRESH_FAIL, TYPE_LOAD_MORE_SUCCESS, TYPE_LOAD_MORE_FAIL})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DataLoadTypeChecker {

    }
}
