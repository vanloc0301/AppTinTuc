package com.example.vanloc.apptintuc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by vanloc on 4/18/2016.
 */
//khai báo này cho phép annotation dùng trong RUNTIME(thực thi chương trình)
@Retention(RetentionPolicy.RUNTIME)
//@Target xác định thành phần nào trong 1 class có thể dùng annotation đã định nghĩa.
@Target({ElementType.TYPE})
public @interface ActivityFragmentInject {
    int contentViewId() default -1;

    int menuId() default -1;

    boolean enableSlidr() default false;

    boolean hasNavigationView() default false;

    int toolbarTitle() default -1;

    int toolbarIndicator() default -1;

    int menuDefaultCheckedItem() default -1;
}
