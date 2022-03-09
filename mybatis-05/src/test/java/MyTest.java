import com.zjh.bean.Blog;
import com.zjh.dao.BlogMapper;
import com.zjh.utils.IdUtils;
import com.zjh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;


public class MyTest {
    @Test
    public void addTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void QueryTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title", "Spring");
        map.put("author", "狂神说");

        mapper.queryBlogIf(map);
        sqlSession.close();
    }
}
