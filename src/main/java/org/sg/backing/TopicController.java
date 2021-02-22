package org.sg.backing;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.sg.domain.Topic;

@ManagedBean
@SessionScoped
public class TopicController {
	private List<Topic> topicList = new ArrayList<Topic>();
	private Topic selectedTopic;
	
	private int newId;
	private String newName;
	private String newDescription;
	
	public void addTopic() {
		Topic topic = new Topic();
		topic.setId(newId);
		topic.setName(newName);
		topic.setDescription(newDescription);
		topicList.add(topic);
		System.out.println("Topic " + topic + " added correctly");
	}
	
	public void deleteTopic(Topic topic) {
		topicList.remove(topic);
		System.out.println("Topic " + topic + " deleted correctly");
	}
	
	public String updateSelectedTopic(Topic topic) {
		selectedTopic = topic;
		return "/app/topic/editTopic.xhtml?faces-redirect=true";
	}
	
	public String updateTopic() {
		System.out.println("Topic " + selectedTopic + " updated correctly");
		return "/app/topic/homeTopic.xhtml?faces-redirect=true";
	}
	
	public String viewTopic(Topic topic) {
		selectedTopic = topic;
		System.out.println("Topic " + topic + " showed correctly");
		return "/app/topic/viewTopic.xhtml?faces-redirect=true";
	}
	
	public int getNewId() {
		return newId;
	}
	public void setNewId(int newId) {
		this.newId = newId;
	}
	public String getNewName() {
		return newName;
	}
	public void setNewName(String newName) {
		this.newName = newName;
	}
	public String getNewDescription() {
		return newDescription;
	}
	public void setNewDescription(String newDescription) {
		this.newDescription = newDescription;
	}
	
	public List<Topic> getTopicList() {
		return topicList;
	}
	public Topic getSelectedTopic() {
		return selectedTopic;
	}
}
