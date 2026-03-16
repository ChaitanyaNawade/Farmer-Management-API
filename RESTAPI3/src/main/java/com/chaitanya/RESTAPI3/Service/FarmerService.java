package com.chaitanya.RESTAPI3.Service;


import com.chaitanya.RESTAPI3.Model.Farmers;

import java.util.List;

public interface FarmerService
{
    public void Save(Farmers fobj);

    public List<Farmers> GetAll();

    public int Delete(int fid);

    public String Update(Farmers fobj);
}
