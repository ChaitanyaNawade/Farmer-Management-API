package com.chaitanya.RESTAPI3;

import com.chaitanya.RESTAPI3.Model.Farmers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepo extends JpaRepository<Farmers,Integer>
{

}
