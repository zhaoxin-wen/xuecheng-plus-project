package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.CourseCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wzw
 * @date 2023/4/10 0:36
 * @description 课程分类树型结点dto
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory implements Serializable {

    //子节点
    List<CourseCategoryTreeDto> childrenTreeNodes;
}
