package com.example.demo;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.INameConvert;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.po.TableField;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import lombok.NonNull;

import java.util.Collections;
import java.util.Map;

public class MybatisGenerator {

    private static final Map<String, String> TABLE_MAP = Map.ofEntries(
            Map.entry("tbl_cart", "Cart"),
            Map.entry("tbl_delivery", "Delivery"),
            Map.entry("tbl_order_detail", "OrderDetail"),
            Map.entry("tbl_orders", "Orders"),
            Map.entry("tbl_payment", "Payment"),
            Map.entry("tbl_products", "Products"),
            Map.entry("tbl_user_addresses", "UserAddresses"),
            Map.entry("tbl_users", "Users")
            // Khai báo các bảng và file đối tượng được ánh xạ tương ứng
    );

    //        static final String GENERATED_DIR = "C:mybatis";
    //        Nơi trả về khi thực hiện chạy
//    static final String GENERATED_DIR = "/home/ubuntu/Downloads/mybatis-generator/src/main";
    static final String GENERATED_DIR = "D:\\New folder";

    public static class EntityNameConverter implements INameConvert {
        @Override
        @NonNull
        public String entityNameConvert(@NonNull TableInfo tableInfo) {
            String tableName = tableInfo.getName();
            if(!TABLE_MAP.containsKey(tableName)) {
                throw new RuntimeException("Table name " + tableName + " not exist!");
            }
            return TABLE_MAP.get(tableName);
        }

        @Override
        @NonNull
        public String propertyNameConvert(@NonNull TableField field) {
            String[] parts = field.getName().split("_");
            StringBuilder propertyName = new StringBuilder(parts[0].toLowerCase());
            for (int i = 1; i < parts.length; i++) {
                propertyName.append(parts[i].substring(0, 1).toUpperCase())
                        .append(parts[i].substring(1).toLowerCase());
            }
            return propertyName.toString();
        }
    }

    public static void main(String[] args) {
        // FastAutoGenerator dùng để kết nối với CSDL
        FastAutoGenerator.create("jdbc:mysql://localhost:3307/order", "admin", "admin")
                .globalConfig(builder -> {
                    builder.author("ttd")
                            .enableSwagger()
                            .outputDir(GENERATED_DIR)
                    ;
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.demo") // đường dẫn thư mục root
                            .moduleName("")
                            .entity("entity")  // tên thư mục trả về các đối tượng
                            .mapper("mapper")  // tên thư mục trả về repository
                            .pathInfo(Collections.singletonMap(OutputFile.xml, GENERATED_DIR + "/resources/mapper"));
                    ;
                })
                .strategyConfig(builder -> {
                    TABLE_MAP.forEach((k, v) -> {
                        builder.addInclude(k);
                    });
                    builder.entityBuilder()
                            .enableLombok()
                            .disableSerialVersionUID()
                            .enableTableFieldAnnotation()
                            .nameConvert(new EntityNameConverter())
                            .mapperBuilder()
                            .enableMapperAnnotation()
                            .enableBaseResultMap()
                            .enableBaseColumnList()
//                            .cache(MyMapperCache.class)
                            .formatMapperFileName("%sMapper")
                            .formatXmlFileName("%sMapper")
                            .build();
                })
                .execute();
    }
}
