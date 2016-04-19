package com.example.vanloc.apptintuc.utils;

import android.os.Debug;
import android.os.SystemClock;
import android.util.Log;

import com.example.vanloc.apptintuc.BuildConfig;

/**
 * Created by vanloc on 4/19/2016.
 * Mô tả: khi người dùng nhấn 2 lần quá nhanh. Chặn điều đó để không thảy ra exception mong muốn.
 */
public class ClickUtils {

    private static final String TAG = ClickUtils.class.getSimpleName();
    private static final String BLANK_LOG = "\t";
    private static boolean sIsDebug = BuildConfig.DEBUG;
    private static long sLastClickTime = 0L;

    /**
     * Click liên tục bị lỗi, nên set cho nó 2 click cách nhau 500ms để phản hồi
     * @return true: click nhanh
     */

    public static boolean isFastDoubleClick() {
        long nowTime = SystemClock.elapsedRealtime();   //tính từ bắt đầu khởi chạy ứng dụng tới hiện tại tính theo mili giây

        if(sIsDebug) {
            // Bàn về Log.d(Đọc thêm trong phần ~/utils/README.md
            Log.d(TAG, "thời gian hiện tại: " + nowTime);
            Log.d(TAG, "lần cuối click là lúc: " + sLastClickTime);
            Log.d(TAG, "Khoảng thời gian giữa 2 lần: " + (nowTime - sLastClickTime));
        }

        if((nowTime - sLastClickTime) < 250) {

            if(sIsDebug) {
                Log.d(TAG, "Click nhanh");
                Log.d(TAG, BLANK_LOG);
            }
            return true;
        } else {
            sLastClickTime = nowTime;

            if (sIsDebug) {
                Log.d(TAG, "lần cuối click lúc: " + sLastClickTime);
                Log.d(TAG, "Không phải click nhanh");
                Log.d(TAG, BLANK_LOG);
            }
            return false;
        }
    }
}
