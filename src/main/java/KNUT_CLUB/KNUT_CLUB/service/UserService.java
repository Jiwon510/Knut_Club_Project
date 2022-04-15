package KNUT_CLUB.KNUT_CLUB.service;

import KNUT_CLUB.KNUT_CLUB.entitiy.User;
import KNUT_CLUB.KNUT_CLUB.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public String join(User user) {

        valiateDuplicateUser(user); //중복 회원 검증
        userRepository.save(user);
        return user.getStudentID();
    }

    private void valiateDuplicateUser(User user) {

        List<User> findUsers = userRepository.findByName(user.getName());
        if(!findUsers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    public List<User> findUsers() {
        return userRepository.fidAll();
    }

    public User findUser(String studentID) {
        return userRepository.findUser(studentID);
    }

    public boolean login(User user) {
        User findUser = userRepository.findUser(user.getStudentID());
        System.out.println(findUser);

        if(findUser == null) {
            return false;
        }

        if(!findUser.getPassword().equals(user.getPassword())) {
            return false;
        }
        return true;
    }
}
