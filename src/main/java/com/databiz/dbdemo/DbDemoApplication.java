package com.databiz.dbdemo;

import com.databiz.dbdemo.entity.Storeinformation;
import com.databiz.dbdemo.repository.StoreinformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDemoApplication implements CommandLineRunner {
	@Autowired
	StoreinformationRepository storeinformationRepository;

	public static void main(String[] args) {

		SpringApplication.run(DbDemoApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		Storeinformation storeinformationOne= new Storeinformation("Amazon","farouk is hear","xxxxxx");
		Storeinformation storeinformationTwo= new Storeinformation("flipkart","fathi is hear","yyyyyyy");
		Storeinformation storeinformationThree= new Storeinformation("Meecho","abdelhamid is hear","nnnnnnn");
		Storeinformation storeinformationFour= new Storeinformation("Myntra","faouzi is hear","lllllll");
		storeinformationRepository.save(storeinformationOne);
		storeinformationRepository.save(storeinformationTwo);
		storeinformationRepository.save(storeinformationThree);
		storeinformationRepository.save(storeinformationFour);
		storeinformationRepository.findByStoreName("Amazon").forEach(
				val-> System.out.println(val)
		);
		storeinformationRepository.findByStoreDetail("abdelhamid is hear").forEach(
				val-> System.out.println(val)
		);
		storeinformationRepository.findByPhoneNumber("yyyyyyy").forEach(
				val-> System.out.println(val)
		);
		storeinformationRepository.findById(2).ifPresent(
				val-> System.out.println(val)
		);
		System.out.println (storeinformationRepository.count());

	}
}
