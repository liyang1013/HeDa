package com.heda.cy.system.mapper;

import com.heda.cy.system.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {
    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> menuList();

    List<Menu> menuListByRole(Integer roleid);

    List<Menu> getMenuList(Integer userid);

    List<Menu> getChildrenList(@Param("menucode") String menucode,@Param("userid") Integer userid);
}