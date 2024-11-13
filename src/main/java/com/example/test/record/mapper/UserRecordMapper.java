package com.example.test.record.mapper;

import com.example.test.model.User;
import com.example.test.record.UserRecord;

public class UserRecordMapper {

    public static UserRecord map(User user) {
        return new UserRecord(
                user.getId(),
                user.getUsername(),
                user.getPassword()
        );
    }
}
