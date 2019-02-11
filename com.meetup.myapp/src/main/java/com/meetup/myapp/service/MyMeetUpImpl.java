package com.meetup.myapp.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.meetup.myapp.MyMeetUp;

public class MyMeetUpImpl implements MyMeetUp{
public final String basicUrl ="https://api.meetup.com";
	
	
	public void travel() {
		
	}

	public void food() {
		
	}

	public void belief() {
		
	}

	public void scienceAndTechnology() {
		
	}

	
	@Path("/topics")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void topics() {
		
	}

	public void getTopics() {
		// TODO Auto-generated method stub
		
	}
	
	

}
