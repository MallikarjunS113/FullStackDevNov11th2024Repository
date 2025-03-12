package com.gentech.practice;

class Article
{
	int articleid;
	String writerName;
	String articleType;
	String articleName;
	String dateOfPublish;
	
	Article()
	{
		articleid=11;
		writerName="Purnachandra";
		articleType="Sprirutual";
		articleName="Chidambara Rahasya";
		dateOfPublish="1985";
		System.out.println("articleid:"+articleid);
		System.out.println("writerName:"+writerName);
		System.out.println("articleType:"+articleType);
		System.out.println("articleName:"+articleName);
		System.out.println("dateOfPublish:"+dateOfPublish);
		System.out.println("-----------------------------------");
		
		
	}
	
}

class Comments
{
	int totalComments;
	String commenterName;
	int articalid;
	String commentid;
	String status;
	
	Comments()
	{
		 totalComments=1133;
		 commenterName="Arjuna";
		 articalid=11;
		 commentid="c11";
		 status="read";
		 System.out.println("totalComments:"+totalComments);
		 System.out.println("commenterName:"+commenterName);
		 System.out.println("articalid:"+articalid);
		 System.out.println("commentid:"+commentid);
		 System.out.println("status:"+status);
		 System.out.println("-----------------------------------");
		
		
	}
	
}

public class Withconstructer4 {

	public static void main(String[] args) {
		
		Article obj=new Article();
		
		Comments obj1=new Comments();
		 
	}

}
