package com.example;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;
import de.greenrobot.daogenerator.DaoGenerator;

public class DAOGenerator {
    // Tại sao lại sử dụng GreenDAO? http://tranhung308.blogspot.com/2014/05/huong-dan-su-dung-greendao-trong-android.html
    // và tại đây: http://lomza.totem-soft.com/tutorial-how-to-integrate-greendao/

    // Ngoài ra có thể chọn những ORM khác, đơn giản chọn thằng này vì ứng dụng tin tức cần tốc độ, nhanh. Database đơn giản nên chọn nó.

    public static void main(String[] args) throws Exception {
        int version = 1;
        String defaultJavaPackage = "com.example.vanloc.apptintuc.greendao";
        Schema schema = new Schema(version, defaultJavaPackage);
        addTable(schema);

        //  / là thư mục gốc    ./ là thư mục hiện tại, thư mục cha    ../ 1 level của cây thư mục.
        new DaoGenerator().generateAll(schema, "./app/src/main/java-gen");
    }

    private static void addTable(Schema schema) {
        Entity note = schema.addEntity("ChannelTinTuc");

        note.addStringProperty("channelTen").notNull().primaryKey().index();

        note.addStringProperty("channelID").notNull();

        note.addStringProperty("channelLoai").notNull();

        // Kênh tin tức được lựa chọn
        note.addBooleanProperty("channelLuaChon").notNull();

        // Sắp xếp theo vị trí kênh
        note.addIntProperty("channelIndex").notNull();

        // Kênh cố định
        note.addBooleanProperty("channelFixed");
    }

    // Code xong chuột phải chọn Run DAOGenerator.main() để tự động tạo ra bảng dữ liệu
}
