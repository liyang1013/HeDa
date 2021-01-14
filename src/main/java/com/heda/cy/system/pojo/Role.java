package com.heda.cy.system.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * T_Role
 * @author 
 */
@Data
public class Role implements Serializable {
    private Integer roleid;

    private String rolecode;

    private String rolename;

    private String memo;

    private static final long serialVersionUID = 1L;
}