package com.bj58.oceanus.plugins.mybatis;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.bj58.oceanus.client.Oceanus;
import com.bj58.oceanus.client.idgenerator.Config;
import com.bj58.oceanus.client.idgenerator.IdGenerator;
import com.bj58.oceanus.client.idgenerator.IdGeneratorBuilder;
import com.bj58.oceanus.core.utils.RandomUtil;
import com.bj58.oceanus.plugins.mybatis.entity.Forum;
import com.bj58.oceanus.plugins.mybatis.entity.Topic;
import com.bj58.oceanus.plugins.mybatis.entity.User;

public class MybatisTest {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {

        System.err.println(">>>>>>>>>static begin");
        System.err.println(">>>>>>>>>oceanus begin");
        try {
            URL url = MybatisTest.class.getClassLoader().getResource("configurations_demo.xml");
            File file = new File(url.toURI());
            // 进程启动时要对 Oceanus 进行初始化
            Oceanus.init(file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.err.println(">>>>>>>>>oceanus end");
        try {
            reader = Resources.getResourceAsReader("mybatis_config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.err.println(">>>>>>>>>static end");
    }

//    @Test
//    public void insertForum() throws SQLException {
//        System.out.println(">>>>>>>>>>enter insertForum");
//
//        for (long id = 1; id <= 7; id++) {
//            SqlSession session = sqlSessionFactory.openSession(false);
//            int result = -1;
//            try {
//                result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.ForumMapper.insertForum", new Forum(id, "forum_" + id));
//                System.out.println("inesert result " + result);
//                session.commit();
//            } catch (Exception e) {
//                e.printStackTrace();
//                session.rollback();
//            } finally {
//                session.close();
//            }
//        }
//    }

//    @Test
//    public void insertTopic() throws SQLException {
//        
//        Config config = new Config();
//        config.setInitValue(0);
//        
//            
//        IdGenerator<Long> sequence = IdGeneratorBuilder.build(config);
//        for (long forum = 1; forum <= 3; forum++) {
//            for (long i = 1; i <= 100; i++) {
//                
//                SqlSession session = sqlSessionFactory.openSession(false);
//                int result = -1;
//                try {
//                    long id = sequence.generate();
//                    result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.TopicMapper.insertTopic", new Topic(id, "topic_" + id, "content_" + id, forum, i));
//                    System.out.println("inesert result " + result);
//                    session.commit();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    session.rollback();
//                } finally {
//                    session.close();
//                }
//            }
//        }
//    }
    
    	@Test
	public void selectTest() throws SQLException {
//		for(long id=1; id<=3; id++){
			SqlSession session = sqlSessionFactory.openSession(true);
			try {
                                System.out.println(">>>>>>>>");
				Topic user = session.selectOne("com.bj58.oceanus.plugins.mybatis.entity.TopicMapper.selectTopicByID", Long.valueOf(18));
				System.out.println(user);
                                System.out.println(">>>>>>>>");
//                                User user1 = session.selectOne("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.selectUserByID", Long.valueOf(23));
//				System.out.println(user1);
//                                System.out.println(">>>>>>>>");
			} catch(Exception e){
				e.printStackTrace();
			}finally {
				session.close();
			}
//		}
	}

//	@Test
//	public void insertTest() throws SQLException {
//            
//            System.out.println(">>>>>>>>>>enter insertTest");
//            
//		for(long id=1; id<=100; id++){
//			SqlSession session = sqlSessionFactory.openSession(false);
//			int result = -1;
//			try {
//				result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.insertUser", new User(id, "uname"+id, RandomUtil.nextInt(10, 30)));
//				System.out.println("inesert result " + result);
//				id++;
//				
//				result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.insertUser", new User(id, "uname"+id, RandomUtil.nextInt(10, 30)));
//				System.out.println("inesert result " +result);
//				id++;
//				
//				result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.insertUser", new User(id, "uname"+id, RandomUtil.nextInt(10, 30)));
//				System.out.println("inesert result " +result);
//				id++;
//				
//				result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.insertUser", new User(id, "uname"+id, RandomUtil.nextInt(10, 30)));
//				System.out.println("inesert result " +result);
//				id++;
//				
//				result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.insertUser", new User(id, "uname"+id, RandomUtil.nextInt(10, 30)));
//				System.out.println("inesert result " +result);
//				id++;
//				
//				result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.insertUser", new User(id, "uname"+id, RandomUtil.nextInt(10, 30)));
//				System.out.println("inesert result " +result);
//				id++;
//				
//				result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.insertUser", new User(id, "uname"+id, RandomUtil.nextInt(10, 30)));
//				System.out.println("inesert result " +result);
//				id++;
//				
//				result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.insertUser", new User(id, "uname"+id, RandomUtil.nextInt(10, 30)));
//				System.out.println("inesert result " +result);
//				id++;
//				
//				result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.insertUser", new User(id, "uname"+id, RandomUtil.nextInt(10, 30)));
//				System.out.println("inesert result " +result);
//				id++;
//				
//				result = session.insert("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.insertUser", new User(id, "uname"+id, RandomUtil.nextInt(10, 30)));
//				System.out.println("inesert result " +result);
//				
//				session.commit();
//			} catch(Exception e){
//				e.printStackTrace();
//				session.rollback();
//			}finally {
//				session.close();
//			}
//		}
//                            System.out.println(">>>>>>>>>>leave insertTest");
//	}
//	@Test
//	public void deleteTest() throws SQLException {
//		SqlSession session = sqlSessionFactory.openSession(true);
//                
////                for (int i = 20 ; i < 30; i++ ) {
//                    session.delete("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.deleteUser", 15);
////                }
//		session.close();
//	}
//	@Test
//	public void selectTest() throws SQLException {
////		for(long id=1; id<=3; id++){
//			SqlSession session = sqlSessionFactory.openSession(true);
//			try {
//                                System.out.println(">>>>>>>>");
//				User user = session.selectOne("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.selectUserByID", Long.valueOf(18));
//				System.out.println(user);
//                                System.out.println(">>>>>>>>");
//                                User user1 = session.selectOne("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.selectUserByID", Long.valueOf(23));
//				System.out.println(user1);
//                                System.out.println(">>>>>>>>");
//			} catch(Exception e){
//				e.printStackTrace();
//			}finally {
//				session.close();
//			}
////		}
//	}
//	@Test
//	public void selectLimitTest() throws SQLException{
//		int pageSize = 10;
//		int pageNumber = 1;
//		for(;pageNumber<=2; pageNumber++){
//                    
//                    System.out.println(">>>>>>>");
//                    
//			int startIndex = (pageNumber-1) * pageSize;
//			Map<String, Integer> params = new HashMap<String, Integer>();
//			params.put("startIndex", startIndex);
//			params.put("pageSize", pageSize);
//			
//			SqlSession session = sqlSessionFactory.openSession(true);
//			try {
//				List<User> users = session.selectList("com.bj58.oceanus.plugins.mybatis.entity.UserMapper.selectUserLimit", params);
//				System.out.println(users);
//			} catch(Exception e){
//				e.printStackTrace();
//			}finally {
//				session.close();
//			}
//                        
//                        System.out.println(">>>>>>>");
//		}
//	}
//	@Test
//	public void simpleTest() throws SQLException{
//		while(true){
//			for(long id = 1; id<9999; id++){
//				
//				SqlSession session = sqlSessionFactory.openSession();
//				try {
//					User user = (User) session.selectOne("com.bj58.oceanus.plugins.mybatis.entity.User.selectUserByID", id);
//					System.out.println(user);
//					
////					int result = session.update("com.bj58.oceanus.plugins.mybatis.entity.User.updateUserByID", id);
////					System.out.println(result);
//				} finally {
//					session.close();
//				}
//			}
//		}
//	}
}
