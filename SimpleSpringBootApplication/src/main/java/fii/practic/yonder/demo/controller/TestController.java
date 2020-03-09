package fii.practic.yonder.demo.controller;

import fii.practic.yonder.demo.service.TestService;
import fii.practic.yonder.demo.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin // o protectie
public class TestController {

    //localhost:8080/test/3?doctors=fiipractic - ex de id si name

    @Autowired
    private TestService testService; // = new TestServiceImpl(x, y, z);

    @GetMapping
    @RequestMapping(value = "/test")
    public String getTestMessage(){
        return testService.getTestMessage(); // apare doar in browser; stie sa faca doar GET
    }

    @GetMapping
    public String getNames(){
        return testService.getAll();
    }

    @PostMapping
    public void save(@RequestBody String name){
        testService.save(name);
    }

    @PutMapping
    @RequestMapping(value = "/{id}")
    public void update(@PathVariable Integer id, @RequestBody String newValue){
        testService.update(id,newValue);
    }

    @DeleteMapping
    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id){
        testService.delete(id);
    }
}
