package org.sg.campus.backing;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ApplicationBean {
	private int num;
	
	public int getNextInt() {
		return num++;
	}
}
