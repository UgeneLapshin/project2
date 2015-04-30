package com.levelup.dao.impl;

import com.levelup.dao.ToolRepository;
import com.levelup.model.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("toolRepository")
public class ToolRepositoryImpl implements ToolRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private RowMapper<Tool> rowMapper= new RowMapper<Tool>() {
        @Override
        public Tool mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            Tool tool = new Tool();
            tool.setId(resultSet.getLong("id"));
            tool.setName(resultSet.getString("name"));
            tool.setBuyDate(resultSet.getDate("buyDate"));
            tool.setSellDate(resultSet.getDate("sellDate"));
            tool.setBuyPrice(resultSet.getDouble("buyPrice"));
            tool.setSellPrice(resultSet.getDouble("sellPrice"));
            return tool;
        }
    };

    @Override
    public Tool saveTool(Tool tool) {
        String sql = "INSERT INTO tool (name, buyDate, sellDate, buyPrice, sellPrice) VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.queryForObject(sql, rowMapper);
    }

    @Override
    public Tool updateTool(Tool tool) {
        String sql = "UPDATE TOOL SET";
        return jdbcTemplate.queryForObject(sql, rowMapper);
    }

    @Override
    public void removeTool(Tool tool) {
        jdbcTemplate.queryForList("DELETE FROM USER WHERE id=?", tool.getId());
    }

    @Override
    public Tool getToolById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM TOOL where id=?",rowMapper, id);
    }

    @Override
    public List<Tool> getAllTool() {
        return jdbcTemplate.query("SELECT * FROM TOOL", rowMapper);
    }
}
