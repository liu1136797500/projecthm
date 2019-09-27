package cn.itsource.dao;

import cn.itsource.model.SetMealRole;
import java.util.List;

public interface SetMealRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SetMealRole record);

    SetMealRole selectByPrimaryKey(Integer id);

    List<SetMealRole> selectAll();

    int updateByPrimaryKey(SetMealRole record);
}