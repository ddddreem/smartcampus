package org.dp.smartcampus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_grade")
public class Grade { // 年级类

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private String introducation;
    private String manager;
    private String email;
    private String telephone;
}
