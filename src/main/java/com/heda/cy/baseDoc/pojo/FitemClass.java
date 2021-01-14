package com.heda.cy.baseDoc.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * fitemss00class
 * @author 
 */
@Data
public class FitemClass implements Serializable {
    private Integer iId;

    private String citemccode;

    private String citemcname;

    private Byte iitemcgrade;

    private Boolean bitemcend;

    private String u8name;

    private String cclasstable;

    private static final long serialVersionUID = 1L;
}