package ac.kr.ajou.refactoring;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void login_test_유저아이디가_널이거나_엠티이면_false() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login(null, "pwd");
        assertFalse(result); //null인 경우

        result = loginService.login("", "pwd");
        assertFalse(result);//empty인 경우

    }

    @Test
    public void 유저아이디가_존재하지_않으면_false() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login("tet0", "test0");
        assertFalse(result);
    }

    @Test
    public void 유저아이디가존재하지만패스워드가틀리면_false() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login("test0", "tes");
        assertFalse(result);
    }

    @Test
    public void 유저아이디가존재하고패스워드가맞으면_true() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login("test0", "test0");
        assertTrue(result);
    }


    @Test
    public void getUserByName에서_아이디가존재하지않으면_null() {
        LoginService loginService = new LoginService();
        String result = loginService.getUserNameById("test");
        assertNull(result);
    }


    @Test
    public void getAge에서모든유저들을반환하는test()
    {
        LoginService loginService = new LoginService();
        List<Player> allplayers = loginService.getAge(1);
        assertThat(allplayers.size(),is(10));
    }
}