import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Container {

    @Autowired
    UserRep repository;

    public void add(User user){
        repository.save(user);
    }

    public List<User> out(){
        return (List<User>) repository.findAll();
    }
}