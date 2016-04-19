package com.example.vanloc.apptintuc.module.tintuc.presenter;

import com.example.vanloc.apptintuc.base.BasePresenter;

/**
 * Created by vanloc on 4/19/2016.
 */
public interface INewsPresenter extends BasePresenter {
    /**
     * Method này được gọi để cập nhật cơ sở dữ liệu sau khi phân loại hoặc xóa kênh thay đổi
     */
    void operateChannelDb();
}
