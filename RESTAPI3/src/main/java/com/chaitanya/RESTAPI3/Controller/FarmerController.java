package com.chaitanya.RESTAPI3.Controller;

import com.chaitanya.RESTAPI3.Model.Farmers;
import com.chaitanya.RESTAPI3.Service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:8080/SaveData
//http://localhost:8080/GetData
//http://localhost:8080/Delete/3

@RestController
public class FarmerController
{
    @Autowired
    FarmerService fsobj;

    @GetMapping("/start")
    public String Start()
    {
        return "Welcome to the third API";
    }

    @PostMapping("/SaveData")
    public String SaveData(@RequestBody Farmers fobj)
    {
        fsobj.Save(fobj);
        return "Data Saved";
    }

    @GetMapping("/GetData")
    public List<Farmers> GetAll()
    {
        List<Farmers> l1 = fsobj.GetAll();
        return  l1;
    }

    @DeleteMapping("/Delete/{fid}")
    public String Del(@PathVariable("fid") int id)
    {
        fsobj.Delete(id);
        return "data deleted";
    }

    @PutMapping("/UpdateData")
    public String Update(@RequestBody Farmers fobj)
    {
        return fsobj.Update(fobj);
    }
}
