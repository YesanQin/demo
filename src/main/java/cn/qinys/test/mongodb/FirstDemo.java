package cn.qinys.test.mongodb;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class FirstDemo {
	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		// DB db = mongoClient.getDB("qinys");
		MongoDatabase mongoDatabase = mongoClient.getDatabase("qinys");
		MongoCollection mongoCollection = mongoDatabase.getCollection("users");
		System.out.println(mongoCollection.getNamespace());
	}
}
