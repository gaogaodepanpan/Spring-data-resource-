package com.bjsxt.springbootvalidate.pojo;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @NotNull: 对基本数据类型的对象类型做非空校验
 * @NotBlank：对字符串类型做非空校验
 * @NotEmpty：对集合类型做非空校验
 */
public class Users {
    //@NotNull(message ="{userid.notnull}" )
    private  Integer userid;
    @NotBlank(message = "{username.notnull}")
    @Length(min =3 ,max =8,message = "最小3，最大8")
    private String username;
    @NotBlank(message = "{usersex.notnull}")
    private String usersex;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usersex='" + usersex + '\'' +
                '}';
    }
}
