package com.example.mapstruct.ObjectMapper.qualifier.mapper;

import org.mapstruct.Named;

/**
 * @ClassName:
 * @Description: 自定义映射器
 * @Date : 2020-11-22 15:58
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Named("DoneFormater")
public class DoneFormater {

    @Named("DoneFormater")
    public String toStr(Boolean isDone) {
        if (isDone) {
            return "已完成";
        } else {
            return "未完成";
        }
    }

    @Named("DoneDetailFormater")
    public String toDetail(Boolean isDone) {
        if (isDone) {
            return "该产品已完成";
        } else {
            return "该产品未完成";
        }
    }

    public Boolean toBoolean(String str) {
        if (str.equals("已完成")) {
            return true;
        } else {
            return false;
        }
    }

}
