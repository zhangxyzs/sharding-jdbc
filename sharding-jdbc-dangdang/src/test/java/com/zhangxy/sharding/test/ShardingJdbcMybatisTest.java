package com.zhangxy.sharding.test;

/**
 * 测试类
 *
 * @author zhangxy
 * @date 2019/03/01
 **/

import com.zhangxy.sharding.entity.Role;
import com.zhangxy.sharding.entity.Student;
import com.zhangxy.sharding.entity.User;
import com.zhangxy.sharding.service.RoleService;
import com.zhangxy.sharding.service.StudentService;
import com.zhangxy.sharding.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 测试分库分表规则
 * @author liuyazhuang
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:config/spring/spring-database.xml", "classpath*:config/spring/spring-sharding.xml" })
public class ShardingJdbcMybatisTest {

    @Resource
    public UserService userService;

    @Resource
    public StudentService studentService;

    @Resource
    public RoleService roleService;


    @Test
    public void testUserInsert() {
        User u = new User();
        u.setUserId(22);
        u.setAge(213);
        u.setName("github");
        Assert.assertEquals(userService.insert(u), true);
    }

    @Test
    public void testStudentInsert() {
        Student student = new Student();
        student.setStudentId(21);
        student.setAge(21);
        student.setName("hehe");
        Assert.assertEquals(studentService.insert(student), true);
    }

    @Test
    public void testFindAll(){
        List<User> users = userService.findAll();
        if(null != users && !users.isEmpty()){
            for(User u :users){
                System.out.println(u);
            }
        }
    }
    @Test
    public void testRoleFindAll(){
        List<Role> roles = roleService.findAll();
        System.out.println(roles);
    }



    @Test
    public void testSQLIN(){
        List<User> users = userService.findByUserIds(Arrays.asList(1));
        if(null != users && !users.isEmpty()){
            for(User u :users){
                System.out.println(u);
            }
        }
    }

    @Test
    public void testTransactionTestSucess(){
        userService.transactionTestSucess();
    }

    @Test(expected = IllegalAccessException.class)
    public void testTransactionTestFailure() throws IllegalAccessException{
        userService.transactionTestFailure();
    }
}

