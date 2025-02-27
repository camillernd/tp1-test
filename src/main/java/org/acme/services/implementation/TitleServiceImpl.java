package org.acme.services.implementation;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.services.TitleService;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class TitleServiceImpl implements TitleService {
    @Override
    public String title(Integer p, String title) {
        return "#".repeat(Math.max(0, p)) + title;
    }

    @Override
    public List<String> animation(Integer p, String title) {
        List<String> anime = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            anime.add(this.title(i, title));
        }
        return anime;
    }
}
