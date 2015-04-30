package com.levelup.dao.impl;

import com.levelup.dao.UserRepository;
import com.levelup.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<User> rowMapper= new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            User user = new User();
            user.setId(resultSet.getLong("id"));
            user.setName(resultSet.getString("name"));
            user.setAccountNumber(resultSet.getInt("accountNumber"));
            user.setAmount(resultSet.getDouble("amount"));
            user.setEmail(resultSet.getString("email"));
            user.setPassword(resultSet.getString("password"));
            return user;
        }
    };

    @Override
    public User saveUser(User user) {
        String sql = "INSERT INTO USER " + "(name, accountNumber, amount, email, password ) VALUES(?,?,?,?,?)";
        return jdbcTemplate.queryForObject(sql, rowMapper);
    }

    @Override
    public User updateUser(User user) {
        String sql = "UPDATE USER SET ";
        return jdbcTemplate.queryForObject(sql, rowMapper);
    }

    @Override
    public void removeUser(User user) {
        jdbcTemplate.queryForList("DELETE FROM USER WHERE id=?", user.getId());
    }

    @Override
    public User getUserById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM USER where id=?",rowMapper, id);
    }

    @Override
    public List<User> getAllUser() {
        return jdbcTemplate.query("SELECT * FROM USER", rowMapper);
    }
}
