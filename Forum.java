import java.util.*;
import java.lang.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

// Forum Holds posts, a title and description
class Forum{
	String creator;
	String title;
	String description;
	ArrayList<Post> posts = new ArrayList<Post>();
	
	public Forum(String creator, String title, String description){
		this.creator = creator;
		this.title = title;
		this.description = description;
	}
	
	// GETTERS ////////////////////
	public String getTitle(){
		return this.title;
	}
	public String getDescription(){
		return this.description;
	}
	public String getCreator(){
		return this.creator;
	}
	///////////////////////////////
	
	
	// Make a new post
	public void createPost(String postTitle, String postBody){

		Post post = new Post(postTitle, postBody);
		posts.add(post);
		
	}
	// Delete a post
	public void deletePost(Post targetPost){
		for(int i = 0; i < posts.size(); i++){
			if (posts.get(i) == targetPost){
				posts.remove(i);
			}
		}
	}
	
	
	
}