package com.aop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MyBean2 implements IMyBean<List<Integer>> {
    private List<Integer> data = new ArrayList<Integer>();
    private Date date = Calendar.getInstance().getTime();

    public void setDataObject(List<Integer> object) {
        data = object;
    }

    public List<Integer> getDataObject() {
        return data;
    }

    public void addData(Object object) {
        data.add(Integer.parseInt(object.toString()));
    }

    @Override
    public String toString() {
        String result = "MyBean2{data=";
        for (Integer n : data) {
            result += n + ", ";
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return result += "date=" + formatter.format(date) + "}";
    }
}
