package fii.practic.yonder.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Service // fara service nu fct
public class TestServiceImpl implements TestService {

    private Map<Integer, String> map = new HashMap<>();
    private Integer id = 0;
    @Override
    public String getTestMessage() {
        return "Hello FII Prcatic";
    }

    @Override
    public String getAll() {
        return map.toString();
    }

    @Override
    public void save(String name) {
        map.put(id,name);
        id++;
    }

    @Override
    public void update(Integer id, String newValue) {
        map.put(id, newValue);
    }

    @Override
    public void delete(Integer id) {
        map.remove(id);
    }


}
