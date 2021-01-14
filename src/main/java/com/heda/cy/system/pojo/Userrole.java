package com.heda.cy.system.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * T_UserRole
 * @author 
 */
@Data
public class Userrole implements Serializable {
    private Integer id;

    private Integer roleid;

    private Integer userid;

    private static final long serialVersionUID = 1L;
}