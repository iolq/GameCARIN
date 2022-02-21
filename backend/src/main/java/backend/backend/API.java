package backend.backend;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public class API {
    private int somthing;

    public void setApi(int something){
        this.somthing = something;
    }

    public int getApi(){
        return this.somthing;
    }
    
}
