package com.example.crm.service;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MustacheTextTemplateEngine implements TextTemplateEngine {

    private final MustacheFactory factory = new DefaultMustacheFactory();

    @Override
    public String interpret(String template, Map<String, Object> vars) {
        StringWriter stringWriter = new StringWriter();
        Mustache mustache = factory.compile(template);
        Writer writer = mustache.execute(stringWriter, vars);

        return writer.toString();
    }
}
