package com.heda.cy.system.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * T_User
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer userid;

    private String usercode;

    private String username;

    private String password;

    private String userpwd;

    private String decode;

    private String dename;

    private Integer jurisdiction;

    private Boolean isenable;

    private String hruserid;

    private Boolean islogin;

    private String depid;

    private String sessionkey;

    private Boolean webuser;

    private Boolean isadmin;

    private Integer issuperpda;

    private String bar;

    private Role role;

    private static final long serialVersionUID = 1L;
}