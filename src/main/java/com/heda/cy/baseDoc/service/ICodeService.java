package com.heda.cy.baseDoc.service;

import com.heda.cy.baseDoc.pojo.Code;
import com.heda.cy.baseDoc.pojo.CodeKey;

import java.util.List;

public interface ICodeService {
    List<Code> code(CodeKey codeKey);

    void SyncCode(List<Code> codeList,String u8name);
}
