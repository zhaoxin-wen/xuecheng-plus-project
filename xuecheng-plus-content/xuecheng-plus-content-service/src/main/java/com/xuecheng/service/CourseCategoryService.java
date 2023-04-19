package com.xuecheng.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author wzw
 * @date 2023/4/10 21:09
 * @description
 */
public interface CourseCategoryService {
    /**
     * 课程分类树形结构查询
     *
     * @return
     */
    public List<CourseCategoryTreeDto> queryTreeNodes(String id);

}
