package dgsw.ranking.dsranking.service.impl;

import dgsw.ranking.dsranking.domain.User;
import dgsw.ranking.dsranking.service.UserService;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Override
    public User getByEmail(String email) {
        return User.builder()
                .email("hinu0622@gmail.com")
                .name("이재진").build();
    }
}
