package dgsw.ranking.dsranking.service;

import dgsw.ranking.dsranking.domain.User;

public interface UserService {

    User getByEmail(String email);

}
