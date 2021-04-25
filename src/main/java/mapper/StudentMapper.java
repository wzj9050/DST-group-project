/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package mapper;

import org.apache.ibatis.annotations.Select;
import pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @author ZijinDesktop2
 * @date 2021/4/25 18:45
 */
@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM student")
    List<Student> findAll();
}
