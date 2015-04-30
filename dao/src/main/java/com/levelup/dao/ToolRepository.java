package com.levelup.dao;

import com.levelup.model.Tool;

import java.util.List;

public interface ToolRepository {

    Tool saveTool(Tool tool);
    Tool updateTool(Tool tool);
    void removeTool(Tool tool);
    Tool getToolById(Long id);
    List<Tool> getAllTool();
}
