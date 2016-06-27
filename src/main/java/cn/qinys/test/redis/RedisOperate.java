package cn.qinys.test.redis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * <p> Title: RedisController.java </p> <p> Description: </p> <p> Copyright: Copyright (c) 2015 </p> <p> Company: hao24
 * </p>
 *
 * @author chenwj 14483
 * @date 2016年1月5日
 */
//@Component
public class RedisOperate
{
	public static void main(String[] args)
	{
		RedisOperate redisOperate = new RedisOperate();
//		redisOperate.set("age", "28");
		
		System.out.println(redisOperate.get("age"));
	}
//	private static final Logger LOGGER = LoggerFactory.getLogger(RedisOperate.class);
	// jedis池
	private static JedisPool pool;
	private static Properties configProperties;

	// 静态代码初始化池配置
	static
	{
		System.out.println("加载静态块");
		Properties props = new Properties();

		try
		{
			props.load(RedisOperate.class.getClassLoader().getResourceAsStream("conf/redis.properties"));
			// 创建jedis池配置实例
			JedisPoolConfig config = new JedisPoolConfig();
			// 设置池配置项值
			config.setMaxTotal(Integer.valueOf(props.getProperty("jedis.pool.maxActive")));
			System.out.println(props.getProperty("redis.ip"));
			config.setMaxIdle(Integer.valueOf(props.getProperty("jedis.pool.maxIdle")));
			config.setMaxWaitMillis(Integer.valueOf(props.getProperty("jedis.pool.maxWait")));
			config.setTestOnBorrow(Boolean.valueOf(props.getProperty("jedis.pool.testOnBorrow")));
			config.setTestOnReturn(Boolean.valueOf(props.getProperty("jedis.pool.testOnReturn")));
			// 根据配置实例化jedis池
			pool = new JedisPool(config, props.getProperty("redis.ip"), Integer.valueOf(props.getProperty("redis.port")));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	// 保存缓存
	public void set (String key, String value)
	{
		Jedis jedis = null;
		try
		{
			jedis = pool.getResource();
			jedis.set(key, value);
			jedis.expire(key, 60 * 24 * 365);
		}
		finally
		{
			returnResource(jedis);
		}
	}

	// 获取缓存
	public String get (String key)
	{
		Jedis jedis = null;
		try
		{
			jedis = pool.getResource();
			if (!jedis.exists(key))
			{
				return null;
			}
			else
			{
				return jedis.get(key);
			}
		}
		finally
		{
			returnResource(jedis);
		}
	}

	// 获取用户键值
	public List<String> getkeys (String mate)
	{
		Jedis jedis = null;
		try
		{
			jedis = pool.getResource();
			List<String> list = new ArrayList<String>();
			Set<String> keysList = jedis.keys(mate);
			for (String redisKey : keysList)
			{
				list.add(redisKey);
			}
			return list;
		}
		finally
		{
			returnResource(jedis);
		}
	}

	// 删除对应key的缓存
	public void del (String key)
	{
		Jedis jedis = null;
		try
		{
			jedis = pool.getResource();
			jedis.del(key);
		}
		finally
		{
			returnResource(jedis);
		}
	}

	// 释放对象池
	private void returnResource (Jedis jedis)
	{
		if (jedis != null)
		{
			jedis.close();
		}
	}
}
