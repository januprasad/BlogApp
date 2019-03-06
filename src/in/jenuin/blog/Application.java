package in.jenuin.blog;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Application {


    public static void main(String[] args){

        BlogService blogService =  BlogService.instance();
        List<Blog> blogs = Optional.ofNullable(blogService.getBlogs()).orElse(Collections.emptyList());
        System.out.println(blogs.size());

    }

}
