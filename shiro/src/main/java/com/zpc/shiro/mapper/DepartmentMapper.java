package com.zpc.shiro.mapper;

import com.zpc.shiro.entity.Department;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author zhaopinchao
 * @date 2018-7-26 20:56
 */
@Component
public interface DepartmentMapper {

    /**
     * 新增部门
     * @param department
     */
    void addDepartment(Department department);

    /**
     * 修改部门信息
     * @param department
     */
    void updateDeaprtment(Department department);

    /**
     * 获取单个部门
     * @param department_id
     * @return
     */
    Department getDepartment(Integer department_id);

    /**
     * 分页查询部门信息
     * @param param
     * @return
     */
    List<Department> pagingDepartment(Map<String, Object> param);

    /**
     * 获取分页部门的总数量
     * @param param
     * @return
     */
    Integer countPagingDepartment(Map<String, Object> param);

    /**
     * 删除部门
     * @param department_id
     */
    void deleteDepartent(Integer department_id);

    /**
     * 获取子部门的数量
     * @return
     */
    Integer countChidDepartment(Integer department_id);
}
