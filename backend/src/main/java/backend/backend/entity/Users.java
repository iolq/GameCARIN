package backend.backend.entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
    private @Id @GeneratedValue Long id;
    private String name;
    
    public Users(){}
    public Users(String name){
        this.name = name;
    }

    public Long getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setID(Long id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if(!(o instanceof Users)){
            return false;
        }
        Users user = (Users)o;
        return Objects.equals(this.id,user.id) && Objects.equals(this.name,user.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id,this.name);
    }

    @Override
    public String toString(){
        return "User{" + "id= " + this.id + ", name= " + this.name + "}";
    }
}
