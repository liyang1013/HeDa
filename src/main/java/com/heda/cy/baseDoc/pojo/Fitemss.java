package com.heda.cy.baseDoc.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * fitemss00
 * @author 
 */
@Data
public class Fitemss implements Serializable {
    private Integer iId;

    private String citemcode;

    private String citemname;

    private Boolean bclose;

    private String citemccode;

    private Integer iotherused;

    private String u8name;

    private String ctable;

    private static final long serialVersionUID = 1L;
}