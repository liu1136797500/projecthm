package cn.itsource.dao;

import cn.itsource.model.Dept;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用途：
 * 隐无为-2019/1/12
 */
public interface DeptDao {

    // 查询所有
    @Select("select * from ym_dept")
    public List<Dept> queryAll();


    // 查询所有
    public List<Dept> queryAll2();

}
