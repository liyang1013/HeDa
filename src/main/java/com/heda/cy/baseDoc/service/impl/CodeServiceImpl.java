package com.heda.cy.baseDoc.service.impl;

import com.heda.cy.baseDoc.mapper.CodeMapper;
import com.heda.cy.baseDoc.pojo.Code;
import com.heda.cy.baseDoc.pojo.CodeKey;
import com.heda.cy.baseDoc.service.ICodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl implements ICodeService {

    @Autowired
    private CodeMapper codeMapper;

    @Override
    public List<Code> code(CodeKey codeKey) {
        return codeMapper.code(codeKey);
    }

    @Override
    public void SyncCode(List<Code> codeList,String u8name) {
        codeList.forEach(code -> {
            code.setU8name(u8name);
            Code code1 = codeMapper.selectByPrimaryKey(code);
            if(code1 == null) codeMapper.insertSelective(code); else codeMapper.updateByPrimaryKeySelective(code);
        });
    }
}
