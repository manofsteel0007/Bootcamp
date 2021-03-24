/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;
import com.mongodb.*;
/**
 *
 * @author kumar
 */
public class database {
    MongoClientURI uri;
    MongoClient mongoClient; 
    MongoDatabase database;

    public database() {
            Logger.getLogger("org.mongodb.driver").setLevel(Level.SEVERE);
            this.uri= new MongoClientURI("mongodb+srv://root:root@cluster@student.gqcku.mongodb.net/student?retryWrites=true&w=majority");
            this.mongoClient = new MongoClient(uri);  
            this.database = mongoClient.getDatabase("details");
    }
    public void writedb(student xyz) {
		MongoCollection<Document> detail = database.getCollection("details");
		Document document = new Document("fname", xyz.fname)
				.append("lname", xyz.lname)
                                .append("password", new encrypt().md5encrypt(xyz.password))
				.append("email", xyz.email)
				.append("phoneNo", xyz.phno)
				.append("rollno", xyz.rollno)
				.append("college", xyz.college)
				.append("dept", xyz.dept)
				.append("sec", xyz.sec);
		detail.insertOne(document);
	}
}
