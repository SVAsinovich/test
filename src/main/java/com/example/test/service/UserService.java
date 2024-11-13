package com.example.test.service;

import com.example.test.model.User;
import com.example.test.record.UserRecord;
import com.example.test.record.mapper.UserRecordMapper;
import com.example.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRecord getUser(Long id) {
        User entity = userRepository.findById(id).orElse(null);
        return entity == null ? null : UserRecordMapper.map(entity);
    }

    public List<UserRecord> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserRecordMapper::map)
                .toList();
    }

    public UserRecord createUser(User user) {
        return UserRecordMapper.map(userRepository.save(user));

    }

    public UserRecord updateUser(User user) {
        return UserRecordMapper.map(userRepository.save(user));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
