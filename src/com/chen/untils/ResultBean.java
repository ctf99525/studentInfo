package com.chen.untils;

public class ResultBean {

	public ResultBean(int status, Object data){
        this.status = status;
        this.data = data;
    }

    /**
     * 状态标记
     */
    private int status;

    /**
     * 返回的详细结果
     */
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return String.format("{\"status\":%s,\"data\":\"%s\"}", status, data);
    }
}
