package com.Kickstarter.main;

import java.util.ArrayList;

public class Projects {
	private ArrayList <CriarProjeto> project = new ArrayList();
	
	public void setProject(CriarProjeto project){
		this.project.add(project);
		
	}
	public ArrayList getProjects(){
		return this.project;
		
	}
}
