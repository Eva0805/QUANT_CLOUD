package cn.itcast.utils;

import javafx.scene.input.DataFormat;
import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
  *字符串转日期
 */
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if(source == null){
            throw new RuntimeException("请输入参数");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-DD");
        try{
            return df.parse(source);
        }catch (Exception e){
            throw new RuntimeException("参数格式错误");
        }
        //return null;
    }
}
