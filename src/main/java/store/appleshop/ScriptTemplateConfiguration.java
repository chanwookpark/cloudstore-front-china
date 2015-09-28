package store.appleshop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.script.ScriptTemplateConfigurer;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * @author chanwook
 */
@Configuration
public class ScriptTemplateConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.scriptTemplate().prefix("/templates/").suffix(".html");
    }

    @Bean
    public ScriptTemplateConfigurer scriptTemplateConfigurer() {
        final ScriptTemplateConfigurer configurer = new ScriptTemplateConfigurer();
        configurer.setScripts("templates/dust.js",
                "/META-INF/resources/webjars/dustjs-linkedin/2.6.1/dust-full.js");
        configurer.setRenderFunction("render");
        configurer.setSharedEngine(true);

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        configurer.setEngine(engine);

        return configurer;
    }
}

