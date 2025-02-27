package org.acme.services;

import java.util.List;

public interface TitleService {
    String title(Integer p, String carmaggedon);
    List<String> animation(Integer p, String title);
}
