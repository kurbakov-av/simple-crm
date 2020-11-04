package com.example.crm.service;

import java.util.Map;

public interface TextTemplateEngine {
    String interpret(String template, Map<String, Object> vars);
}
