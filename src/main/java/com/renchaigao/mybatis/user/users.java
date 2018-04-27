package com.renchaigao.mybatis.user;

public class users {
    private Integer id;
    private String nickname;
    private String image;
    private Integer unionID;
    private String address;
    private Integer myrankID;
    private String vip;
    private Integer mytermsID;
    private Integer myanswerID;

    public Integer getId() {
        return id;
    }

    public Integer getMyrankID() {
        return myrankID;
    }

    public Integer getMytermsID() {
        return mytermsID;
    }

    public Integer getUnionID() {
        return unionID;
    }

    public String getImage() {
        return image;
    }

    public Integer getMyanswerID() {
        return myanswerID;
    }

    public String getNickname() {
        return nickname;
    }

    public String getVip() {
        return vip;
    }

    public String getAddress() {
        return address;
    }
    public String[] getAddress(String cutStr) {
        return address.split(cutStr);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAddress(String[] address) {
        String retString = "";
        for (String i : address){
            retString = retString + " " + i;
        }
        this.address = retString;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setMyanswerID(Integer myanswerID) {
        this.myanswerID = myanswerID;
    }

    public void setMyrankID(Integer myrankID) {
        this.myrankID = myrankID;
    }

    public void setMytermsID(Integer mytermsID) {
        this.mytermsID = mytermsID;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setUnionID(Integer unionID) {
        this.unionID = unionID;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }
}
