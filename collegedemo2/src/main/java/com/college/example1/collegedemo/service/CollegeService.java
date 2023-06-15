package com.college.example1.collegedemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.example1.collegedemo.entity.College;
import com.college.example1.collegedemo.repository.CollegeRepository;

@Service
public class CollegeService {
	
	@Autowired
	CollegeRepository cr;
	

//	List<College> collegelist = new ArrayList<> (Arrays.asList(new College("BYK","Nashik","collegeroad","commerce","879768787"),new College("SIOM","PUNE","vadgaon bk","management","5668778")
//			
//			
//			,new College("NBN","PUNE","Ambegaon","Engineering","789785334")));

	public List<College> getAllcollege() {
		
		
			List<College> clist = new ArrayList();
			cr.findAll().forEach(clist::add);
			return clist;
		
		
		//return collegelist;
	}
	
	public College getCollege(String colname) {
		
//		 College result = collegelist.stream().filter(a->a.getColName().equals(colname)).findFirst().get();
//		return result;
		
	 	return cr.findById(colname).get();
	} 

	public void addCollege(College cname) {
			//collegelist.add(cname);
			cr.save(cname);
	}

	public void updateCollege(College t ,String colname) {
	
//		for(int i=0; i<collegelist.size();i++)
//		{
//			College res = collegelist.get(i);
//			
//			if(res.getColName().equals(colname))
//			{
//				collegelist.set(i, t);
//			}
//		}
		
	cr.save(t);
		
	}

	public void deleteCollege(String colname) {
		
		//collegelist.removeIf(a->a.getColName().equals(colname));

		cr.deleteById(colname);
		
	}
	
	

	
	
	
}
