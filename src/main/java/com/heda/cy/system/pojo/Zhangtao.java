package com.heda.cy.system.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * Bas_zhangtao
 * @author 
 */
@Data
public class Zhangtao implements Serializable {
    private String zhangtao;

    private String shujuku;

    private String svencode;

    private String scuscode;

    private Boolean ismain;

    private Integer factorytype;

    private static final long serialVersionUID = 1L;
}