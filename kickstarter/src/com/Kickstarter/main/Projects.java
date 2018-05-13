package com.Kickstarter.main;

import java.util.ArrayList;

public class Projects {
	private ArrayList <CriarProjeto> projects = new ArrayList();
	private ArrayList <CriarProjeto> projectswaiting = new ArrayList();
	public void setProjecs(CriarProjeto project){
		this.projects.add(project);
		
	}
	public void setProjectwaiting(CriarProjeto project){
		this.projectswaiting.add(project);
		
	}
	public ArrayList getProjects(){
		return this.projects;
		
	}
	public ArrayList getProjectsWaiting(){
		return this.projectswaiting;
		
	}
}
