package com.yiqizhuan.mall.controller.user;

import com.yiqizhuan.mall.controller.base.BaseController;
import com.yiqizhuan.mall.dao.mapper.UserDAO;
import com.yiqizhuan.mall.dao.model.User;
import com.yiqizhuan.mall.dao.model.UserExample;
import com.yiqizhuan.mall.common.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: liumingchieh
 * @Date: Created in 2024/4/11 3:24
 * @Description: 测试
 */
@RestController
@Slf4j
public class UserController extends BaseController {
    @Autowired
    private UserDAO userDAO;
    @GetMapping(value = "/hello")
    public CommonResult get(){
        List<User> users = userDAO.selectByExample(new UserExample());
        return success(users.get(1));
    }

}
