package com.nowcoder.community.entity;

public class Page {
    //当前页码
    private int current=1;
    //显示上限
    private int limit=10;
    //数据总数(用于计算总页数)
    private int rows;
    //查村路径(用来复用分页连接)
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current>=1){
            this.current = current;
        }

    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit>=1 && limit<=100){
            this.limit = limit;
        }

    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows>=0){
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    //获取当前也起始行
    public int getOffset(){
        return (current-1)*limit;
    }
    //获取总的页数
    public int getTotal(){
        if(rows%limit==0){
         return rows/limit;
        }else{
            return rows/limit+1;
        }
    }
    //起始页
    public int getFrom(){
        int from=current-2;
        return from<1 ? 1 : from;
    }
    //终止页
    public int getTo(){
        int to=current+2;
        int total=getTotal();
        return to>total ? total : to;
    }
}
