package com.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by paul on 2018/5/10.
 */
@Mapper
public interface CommonMapper {
    public List<LinkedHashMap<String, Object>> findList(@Param("sqlStr") String sqlStr);
    public void executeSql(@Param("sqlStr") String sqlStr);
    public int queryInt(@Param("sqlStr") String sqlStr);
    public String queryString(@Param("sqlStr") String sqlStr);

}
