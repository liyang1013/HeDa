package com.heda.cy.baseDoc.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ComputationGroup
 * @author 
 */
@Data
public class Computationgroup implements Serializable {
    private String cgroupcode;

    private String cgroupname;

    private Byte igrouptype;

    private Byte[] pubufts;

    private String cgrprelinvcode;

    private Boolean bdefaultgroup;

    private String u8name;

    private static final long serialVersionUID = 1L;
}