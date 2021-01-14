package com.heda.cy.system.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * T_RoleMenu
 * @author 
 */
@Data
public class Rolemenu implements Serializable {
    private Integer id;

    private Integer menuid;

    private Integer roleid;

    private static final long serialVersionUID = 1L;
}