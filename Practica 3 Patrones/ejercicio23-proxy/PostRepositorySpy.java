package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public class PostRepositorySpy extends PostRepository{
	public boolean findPostsByUsernameCalled = false;
	
	@Override
	public List<Post> findPostsByUsername(String aUsername){
		this.findPostsByUsernameCalled = true;
		return super.findPostsByUsername(aUsername);
	}
	

}
