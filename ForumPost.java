
public class ForumPost{
	String postContent;
	int creatorID, forumID;
	public ForumPost(Sting content, int ID, int forum){
		postContent = content;
		creatorID = ID;
		forumID = forum;
	}
	
	public String getContents(){
		return postContent;
	}
	
	public int getPostID(){
		return postID;
	}
	
	public int getForumID(){
		return forumID;
	}
	
	public void setContents(String newContents){
		postContents = newContents;
	}
	
	public void setForum(int newForumID){
		forumID = newForumID;
	}
	
	public void setCreator(int newCreatorID){
		creatorID = newCreatorID;
	}
}