package com.xuecheng.content;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.service.CourseCategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wzw
 * @date 2023/4/10 1:10
 * @description
 */
public class CourseCategoryServiceTests {


    @Autowired
    CourseCategoryService courseCategoryService;


    @Test
    void testqueryTreeNodes() {
        List<CourseCategoryTreeDto> categoryTreeDtos = courseCategoryService.queryTreeNodes("1");
        System.out.println(categoryTreeDtos);
    }
}
