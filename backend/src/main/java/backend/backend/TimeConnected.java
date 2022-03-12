package backend.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/time")
public class TimeConnected {
    Time time = new Time();

    @CrossOrigin
    @GetMapping(path = "/getTime")
    public Time getTimeSpeed(){
        return time;
    }

    @CrossOrigin
    @PostMapping(path = "/setTime")
    public int setTimeSpeed(@RequestBody Time num){
        time.setTime(num.getTime());
        return num.getTime();
    }
}
