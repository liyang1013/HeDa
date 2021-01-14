package com.heda.cy.baseDoc.mapper;

import com.heda.cy.baseDoc.pojo.Code;
import com.heda.cy.baseDoc.pojo.CodeKey;

import java.util.List;

public interface CodeMapper {
    int deleteByPrimaryKey(CodeKey key);

    int insert(Code record);

    int insertSelective(Code record);

    Code selectByPrimaryKey(CodeKey key);

    int updateByPrimaryKeySelective(Code record);

    int updateByPrimaryKey(Code record);

    List<Code> code(CodeKey codeKey);
}