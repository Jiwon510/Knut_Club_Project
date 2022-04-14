package KNUT_CLUB.KNUT_CLUB.repository;

import KNUT_CLUB.KNUT_CLUB.entitiy.User;

import java.util.Optional;

public interface UserRepository {
    //    회원 정보 저장
    User save(User user);
    //    Id를 통한 회원 정보 조회
    Optional<User> findById(Long id);
}
