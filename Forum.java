//class that stores the information regarding a forum inside the system
public class Forum{
	ArrayList<ForumPost> posts;
	int forumID;
	String forumName, forumDescription;
	
	public Forum(ArrayList<ForumPost> previousPosts, int ID, String Name, String Description){
		posts = previousPosts;
		forumID = ID;
		forumName = Name;
		forumDescription = Description;
	}
	
	public int getForumID(){
		return forumID;
	}
	
	public String getForumName(){
		return forumName;
	}
	
	public String getForumDescription(){
		return forumDescription;
	}
	
	public void setForumID(int newID){
		forumID = newID;
	}
	
	public voud setForumName(String newName){
		forumName = newName;
	}
	
	public void setForumDescription(String newDescription){
		forumDescription = newDescription;
	}
	
	public void addPost(ForumPost newPost){
		posts.add(newPost);
	}
	
	public ArrayList<ForumPost> getPosts(){
		return posts;
	}
}