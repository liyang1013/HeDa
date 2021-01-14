package com.heda.cy.baseDoc.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * code
 * @author 
 */
@Data
public class CodeKey implements Serializable {
    private Short iyear;

    private String ccode;

    private String u8name;

    private static final long serialVersionUID = 1L;
}