package example.blog.store;

import java.util.List;

import example.blog.domain.Tag;

public interface TagStore {

	boolean create(Tag tag);
	boolean delete(int tagId);
	boolean deleteByPostId(int postId);
	List<Tag> readByPostId(int postId);
}
