package ac.kr.ajou.refactoring;

import java.util.List;

public class LoginService {

    private final DataBaseService dataBaseService;
    private final AccountService accountService = new AccountService(this);

    public LoginService() {
        this.dataBaseService = new DataBaseService();
    }

    public boolean login(String userId, String password) {
        if (isValidUserId(userId)) {
            if (dataBaseService.userExists(userId)) {
                Player player = dataBaseService.getPlayerById(userId);
                return player.getPassword().equals(password);
            }
        }
        return false; //불필요한 else 는 쓰지않도록 한다. 동일한 method 지만 길이가 엄청 줄어들었다. 그리고 refactoring 한 후에 test 를 해서 돌린다.
    }

    private boolean isValidUserId(String userId) {
        return userId != null && !userId.isEmpty();
    }

    public String getUserNameById(String id) {
        return accountService.getUserNameById(id);
    }

    public List<Player> getAge(int a) {
        return accountService.getAge();
    }

    public DataBaseService getDataBaseService() {
        return dataBaseService;
    }
}
