package com.heda.cy.baseDoc.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * fitem
 * @author 
 */
@Data
public class Fitem implements Serializable {
    private String citemClass;

    private Integer iId;

    private String citemName;

    private String citemText;

    private String crule;

    private String ctable;

    private String cclasstable;

    private Byte[] pubufts;

    private String u8name;

    private static final long serialVersionUID = 1L;
}