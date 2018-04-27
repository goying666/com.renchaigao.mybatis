package com.renchaigao.mybatis;

public class merge {

    public String strArgToStr(String[] strArg){
        String retString = "";
        for (String i : strArg){
            retString = retString + "\t" + i;
        }
        return retString;
    }
    public String[] strAllToStrArg(String strAll , String cutStr){
        return strAll.split(cutStr);
    }
}
