package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

public class Simplify_Path_71 {

    public String simplifyPath(String path) {
        String[] parts = path.replaceAll("/+$", "").replaceAll("^/+", "").split("/+");
        List<String> list = new ArrayList<>();
        for (String part: parts)
            if (!part.equals("."))
                if (part.equals("..")) {
                    if (!list.isEmpty()) list.remove(list.size() - 1);
                } else list.add(part);
        return "/" + String.join("/", list);
    }
}
