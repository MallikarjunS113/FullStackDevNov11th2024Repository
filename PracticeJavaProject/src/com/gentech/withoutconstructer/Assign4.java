package com.gentech.withoutconstructer;

class Article
{
	int articleid;
	String writerName;
	String articleType;
	String articleName;
	String dateOfPublish;
	
}

class Comments
{
	int totalComments;
	String commenterName;
	int articalid;
	String commentid;
	String status;
	
}

public class Assign4 {

	public static void main(String[] args) {
		
		Article obj=new Article();
		obj.articleid=11;
		obj.writerName="Purnachandra";
		obj.articleType="Sprirutual";
		obj.articleName="Chidambara Rahasya";
		obj.dateOfPublish="1985";
		System.out.println("articleid:"+obj.articleid);
		System.out.println("writerName:"+obj.writerName);
		System.out.println("articleType:"+obj.articleType);
		System.out.println("articleName:"+obj.articleName);
		System.out.println("dateOfPublish:"+obj.dateOfPublish);
		System.out.println("-----------------------------------");
			
		

		 Comments obj1=new Comments();
		 obj1.totalComments=1133;
		 obj1.commenterName="Arjuna";
		 obj1.articalid=11;
		 obj1.commentid="c11";
		 obj1.status="read";
		 System.out.println("totalComments:"+obj1.totalComments);
		 System.out.println("commenterName:"+obj1.commenterName);
		 System.out.println("articalid:"+obj1.articalid);
		 System.out.println("commentid:"+obj1.commentid);
		 System.out.println("status:"+obj1.status);
		 System.out.println("-----------------------------------");
		

	}

}
