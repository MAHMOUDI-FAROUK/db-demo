package com.databiz.dbdemo.repository;

import com.databiz.dbdemo.entity.Storeinformation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreinformationRepository extends CrudRepository<Storeinformation, Integer> {
    List<Storeinformation> findByStoreName(String name);
    List<Storeinformation> findByPhoneNumber(String phoneNumber);
    List<Storeinformation> findByStoreDetail(String storeDetail);
}
