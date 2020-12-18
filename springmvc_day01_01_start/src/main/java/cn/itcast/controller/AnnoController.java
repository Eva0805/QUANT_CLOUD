package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.utils.StringToDateConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/RequestParam")
    public String testRequestParam(String username){
        System.out.println("执行了！");
        System.out.println(username);
        return "success";
    }

    /**
     * 获取到请求体的内容
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了！");
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable注解
     * @return
     */@RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name="sid")String id){
        System.out.println("执行了！");
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头的值
     * @return
     */@RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value="Accept") String header){
        System.out.println("执行了！");
        System.out.println(header);
        return "success";
    }

    /**
     * 获取Cookie的值
     * @return
     */@RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value="JSESSIONID") String cookieValue){
        System.out.println("执行了！");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModelAttribute注解
     * @return
     */@RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println("modelAttribute  执行了！");
        System.out.println(user);
        return "success";
    }

    //该方法会先执行
    @ModelAttribute
    public User showUser(String uname){
        System.out.println("showUser执行了！");
        //通过用户查询数据库（模拟）
        User user = new User();
        user.setUsername(uname);
        user.setAge(21);
        user.setDate(new Date());
        return user;
    }

    /**
     * testSessionAttributes注解
     * @return
     */@RequestMapping("/testModelAttribute")
    public String testModelAttribute(){
        System.out.println("testModelAttribute执行了！");
        return "success";
    }
}
