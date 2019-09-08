package com.idwxy.exmybatis.entity;

public class Card {

    // 身份证主键 id
    private Integer id;
    // 身份证号码
    private  Integer code;
    // 身份证等级
    private Integer level;

    // 构造函数
    public Card() {
        super();
    }

    public Card(Integer code, Integer level) {
        super();
        this.code = code;
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "Card [id=" + id +
                ",code=" + code +
                ",level=" + level + "]";
    }
}
