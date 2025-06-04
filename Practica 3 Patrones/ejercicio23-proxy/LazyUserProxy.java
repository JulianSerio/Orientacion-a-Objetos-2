package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public class LazyUserProxy implements PersistableUser{
	private String username;
	private String email;
	private List<Post> posts = null;
	private PostRepository postRepository;
	
	public LazyUserProxy(String username, String email, PostRepository postRepo) {
		this.username = username;
		this.email = email;
		this.postRepository = postRepo;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public List<Post> getPosts() {
		if (this.posts == null) {
			this.posts = postRepository.findPostsByUsername(username);
		}
		return posts;
	}

}
