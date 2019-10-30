package com.aop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MyBean1 implements IMyBean<List<String>> {
    private List<String> data = new ArrayList<String>();
    private Date date = Calendar.getInstance().getTime();

    public void setDataObject(List<String> object) {
        data = object;
    }

    public List<String> getDataObject() {
        return data;
    }

    public void addData(Object object) {
        data.add(object.toString());
    }

    @Override
    public String toString() {
        String result = "MyBean1{data=";
        for (String s : data) {
            result += s + ",";
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        result += "date=" + formatter.format(date) + "}";
        return result;
    }
}
