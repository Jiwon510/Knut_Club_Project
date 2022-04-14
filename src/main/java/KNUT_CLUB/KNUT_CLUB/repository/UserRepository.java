package KNUT_CLUB.KNUT_CLUB.repository;

import KNUT_CLUB.KNUT_CLUB.entitiy.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    @PersistenceContext
    EntityManager entityManager;

    // 회원 정보 저장
    public String save(User user) {
        entityManager.persist(user);
        return user.getStudentID();
    }

    // Id를 통한 회원 정보 조회
    public User findUser(String studentID) {
        return entityManager.find(User.class, studentID);
    }

    //  회원 목록 조회
    public List<User> fidAll() {
        return entityManager.createQuery("select m from User m", User.class)
                .getResultList();
    }

    // 이름으로 회원 조회
    public List<User> findByName(String name) {
        return entityManager.createQuery("select m from User m where m.name = :name",
                        User.class)
                .setParameter("name", name)
                .getResultList();
    }
}
