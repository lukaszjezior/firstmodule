package pl.jeziorl.springmvc.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface HelloMapper {
    String getHello(@Param("id") Integer id);
}
