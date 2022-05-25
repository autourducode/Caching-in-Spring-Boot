package io.autourducode.cachinginspringboot;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rickenbazolo
 */
@RestController
@RequestMapping("/demo")
@EnableCaching // activer la mise en cache
public class DemoController {

    @GetMapping("/cache")
    @Cacheable("data") // fournir l'annotation cacheable si vous souhaitez que les données soient mises en cache.
    public String cache() {
        System.out.println("====== cache ======");
        return "Bonjour !";
    }
}
