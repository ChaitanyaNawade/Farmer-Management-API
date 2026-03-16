package com.chaitanya.RESTAPI3.Dao;

import com.chaitanya.RESTAPI3.FarmerRepo;
import com.chaitanya.RESTAPI3.Model.Farmers;
import com.chaitanya.RESTAPI3.Service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmersDao implements FarmerService
{
    @Autowired
    FarmerRepo frobj;

    @Override
    public void Save(Farmers fobj)
    {
        frobj.save(fobj);
    }

    @Override
    public List<Farmers> GetAll()
    {
        return frobj.findAll();
    }

    @Override
    public int Delete(int fid)
    {
        frobj.deleteById(fid);
        return 0;
    }

    @Override
    public String Update(Farmers fobj)
    {
        if(frobj.existsById(fobj.getFid())) {
            frobj.save(fobj);
            return "Data Updated";
        }
        else
        {
            return "Data not get updated";
        }
    }


}
