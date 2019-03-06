package in.jenuin.blog;

import java.util.ArrayList;
import java.util.List;

public class BlogService implements  IBlogService{

    private  ArrayList<Blog> blogs;

    public static BlogService instance() {
        BlogService blog = new BlogService();
        blog.blogs =  new ArrayList<>();
        blog.blogs.add(new Blog(1,"x","xxx"));
        blog.blogs.add(new Blog(2,"a","aaa"));
        blog.blogs.add(new Blog(3,"b","bbb"));
    return blog;
    }

    @Override
    public List<Blog> getBlogs() {
        return blogs;
    }
}
