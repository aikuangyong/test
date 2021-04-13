package com.zywl.model;

import lombok.Data;

@Data
public class ResultData {

    private Object dataList;

    private Object dataObj;

    private int pageCount;

    private int dataCount;

    private int pageNumber;

    private boolean success;

    private String state;

    private String msg;

    public static String toErrorString() {
        ResultData resultData = new ResultData();
        resultData.setState("ERROR");
        resultData.setMsg("服务异常,请稍后再试");
        resultData.setSuccess(false);
        return resultData.toString();
    }

    public static String toSuccessString() {
        ResultData resultData = new ResultData();
        resultData.setState("SUCCESS");
        resultData.setSuccess(true);
        return resultData.toString();
    }

    public static String toSuccessDataObj(Object obj) {
        ResultData resultData = new ResultData();
        resultData.setState("SUCCESS");
        resultData.setDataObj(obj);
        resultData.setSuccess(true);
        return resultData.toString();
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int dataCount, int pageSize) {
        this.pageCount = dataCount / pageSize;
        if (dataCount % pageSize != 0) {
            this.pageCount = this.pageCount + 1;
        }
    }

    public int getDataCount() {
        return dataCount;
    }

    public void setDataCount(int dataCount) {
        this.dataCount = dataCount;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getDataList() {
        return dataList;
    }

    public void setDataList(Object dataList) {
        this.dataList = dataList;
    }

    public Object getDataObj() {
        return dataObj;
    }

    public void setDataObj(Object dataObj) {
        this.dataObj = dataObj;
    }
}
