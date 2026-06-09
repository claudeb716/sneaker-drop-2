package sneakerdrops.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DropService {
    @Autowired
    public DropService() {
    }

    public String getStatus(){
        return  "Sneaker drops loading...";
    }
}
