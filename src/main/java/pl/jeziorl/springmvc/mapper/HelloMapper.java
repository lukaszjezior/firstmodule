package pl.jeziorl.springmvc.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface HelloMapper {

    @Select("SELECT hello FROM hellotable WHERE id = #{id}")
    String getHello(@Param("id") Integer id);
}
