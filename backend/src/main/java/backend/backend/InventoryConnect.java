package backend.backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/inventory")
public class InventoryConnect {
    Inventory invent = new Inventory();

    @CrossOrigin
    @GetMapping(path = "/getInventory")
    public Inventory getInventoryCon(){
        return this.invent;
    }

    @CrossOrigin
    @PostMapping(path = "/setInventory")
    public void setInventoryCon(@RequestBody Inventory inv){
        invent.setInventory(inv);
    }

}
