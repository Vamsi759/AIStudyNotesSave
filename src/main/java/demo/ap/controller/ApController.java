package demo.ap.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.ap.entity.Recorddemo;
import demo.ap.repo.Recorddemorepo;
import demo.ap.service.AiServiceAp;

@Controller
@RequestMapping("/api")
public class ApController {
	
	@Autowired
	private AiServiceAp s;
	
	@Autowired 
	private Recorddemorepo rrepo;
	
	//----------------
	
	@RequestMapping("/open")
	public String denap() {
		return "add";
	}

	@RequestMapping("/open7")
	public String denaap() {
		return "add7";
	}
	
	
	
	
	//-------------
	
	@PostMapping("/add")
	public String addre(@ModelAttribute Recorddemo m) {
		rrepo.save(m);
		
		return "redirect:/api/open";
		
	}
	
	
	
//	@PostMapping("/del")
//	public String remove(@ModelAttribute Recorddemo m) {
//		
//		List<Recorddemo>ap=rrepo.findAll().stream().toList();
//		
//		for(int i=0;i<ap.size();i++) {
//			Recorddemo r=ap.get(i);
//			if(r.getSubjectname().equals(m.getSubjectname()) && r.getMaintopicname().equals(m.getMaintopicname()) && r.getSubtopicname().equals(m.getSubtopicname()) 
//					) {
//				
//				rrepo.deleteById(r.getId());
//				
//			}
//		}
//		return "redirect:/api/open";
//		
//		
//		
//	}
	//------------
	
	public void den() {
		
		List<Recorddemo>ap=rrepo.findAll().stream().toList();
		List<String>subject=new ArrayList<>();
		List<String>main=new ArrayList<>();
		List<String>subl=new ArrayList<>();
		List<String>theory=new ArrayList<>();
		
		for(int i=0;i<ap.size();i++) {
			String s=ap.get(i).getSubjectname();
			String m=ap.get(i).getMaintopicname();
			String sub=ap.get(i).getSubtopicname();
			String t=ap.get(i).getTheory();
			
			if(s!=null && subject.contains(s)!=true) {
				subject.add(s);
			}
			
			if(m!=null && main.contains(m)!=true) {
				main.add(s);
			}
			if(sub!=null && subl.contains(sub)!=true) {
				subl.add(s);
			}
			if(t!=null && theory.contains(t)!=true) {
				theory.add(s);
			}
			
		}
		
		List<List<List<List<Object>>>>res=new ArrayList<>();
		
		List<List<Object>>l1=new  ArrayList<>();
		
		List<List<List<Object>>>l2=new  ArrayList<>();
		

		
		for(int i=0;i<ap.size();i++) {
			
		}
		
		
		
		
		
		
	}
	
	
//----------------------------
	
	
//	@RequestMapping("")
	
	
	@RequestMapping("/home")
	public String denapp() {
		return "home";
	}

}
