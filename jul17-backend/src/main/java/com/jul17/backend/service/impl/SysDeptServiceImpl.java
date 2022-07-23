package com.jul17.backend.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jul17.backend.entity.SysDept;
import com.jul17.backend.mapper.SysDeptMapper;
import com.jul17.backend.service.SysDeptService;
import org.springframework.stereotype.Service;

/**
* @author apple
* @description 针对表【sys_dept(部门表)】的数据库操作Service实现
* @createDate 2022-07-22 17:42:29
*/
@Service("sysDeptService")
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements SysDeptService {


}
