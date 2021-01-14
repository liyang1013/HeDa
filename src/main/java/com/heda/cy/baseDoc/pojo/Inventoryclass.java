package com.heda.cy.baseDoc.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * InventoryClass
 * @author 
 */
@Data
public class Inventoryclass  implements Serializable {
    private String cinvccode;

    private String cinvcname;

    private Byte iinvcgrade;

    private Boolean binvcend;

    private String cecocode;

    private String cbarcode;

    private Byte[] pubufts;

    private String u8name;

    private static final long serialVersionUID = 1L;

}