package cn.aegisa.house2;

import cn.aegisa.house2.model.User;
import cn.aegisa.house2.repository.UserRepository;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * Using IntelliJ IDEA.
 *
 * @author HNAyd.xian at 2018/5/19 15:11
 */
public class Test01 extends ApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test01() {
        Optional<User> optionalUser = userRepository.findById(1L);
        User user = optionalUser.get();
        System.out.println(JSON.toJSONString(user));
    }
}
