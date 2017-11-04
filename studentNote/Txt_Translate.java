package studentNote;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Txt_Translate {
	
	private String finnal_String ="";
	private JSONArray jsonArray;
	private JSONObject jsonObj;
	private JSONObject [] jsonObjWrite = new JSONObject[300];
	private int size = 0;
	public void readTxt()
	{
		 BufferedReader fileReadLoc;  
		 File file = new File(".\\studentNote.txt");
		 if (!file.exists())
			{
			 try {
				 	
				    File writename = new File(".\\studentNote.txt");
			        writename.createNewFile(); // 创建新文件  
			        BufferedWriter out = new BufferedWriter(new FileWriter(writename)); 
			        //out.write("[{\"QQ\":\"请输入QQ\",\"address\":\"请输入地址\",\"phoneNumber\":\"请输入电话\",\"mail\":\"请输入e-mail\",\"personalLanguage\":\"请输入个性化签名\",\"name\":\"请输入姓名\",\"weChat\":\"请输入微信号\"}]");  
			        out.write("[]");  
			        out.flush(); // 把缓存区内容压入文件  
			        out.close(); // 最后记得关闭文件  
			        readTxt();
			        
			    }
				catch (Exception e) {
			        e.printStackTrace();
			    }
			}
		 else
		 {
	        try {
	            fileReadLoc = new BufferedReader(new FileReader(".\\studentNote.txt"));// 读取文件
	            String lineTxt = ""; 
				while ((lineTxt = fileReadLoc.readLine()) != null) {  
	              finnal_String += lineTxt;// 转化为string
	            }
			
	            }  
	           
	     catch (IOException e1) {  
	              // TODO Auto-generated catch block  
	              e1.printStackTrace();  
	            }
		 }
	}
	public int reAllStuJson()
	{
		 jsonArray = JSONArray.fromObject(finnal_String);
		 return jsonArray.size();
	}
	

	public String reName(int num)
	{ 	
		   jsonArray = JSONArray.fromObject(finnal_String);
		   jsonObj  = JSONObject.fromObject(jsonArray.getString(num));
		   return jsonObj.getString("name");
	}
	public String reAddress(int num)
	{ 	
		   jsonArray = JSONArray.fromObject(finnal_String);
		   jsonObj  = JSONObject.fromObject(jsonArray.getString(num));  
		   return jsonObj.getString("address");
	}
	public String rePhoneNumber(int num)
	{ 	
		   jsonArray = JSONArray.fromObject(finnal_String);
		   jsonObj  = JSONObject.fromObject(jsonArray.getString(num));  
		   return jsonObj.getString("phoneNumber");
	}
	public String reWeChat(int num)
	{ 	
		   jsonArray = JSONArray.fromObject(finnal_String);
		   jsonObj  = JSONObject.fromObject(jsonArray.getString(num));  
		   return jsonObj.getString("weChat");
	}
	public String reMail(int num)
	{ 	
		   jsonArray = JSONArray.fromObject(finnal_String);
		   jsonObj  = JSONObject.fromObject(jsonArray.getString(num));  
		   return jsonObj.getString("mail");
	}
	public String reQQ(int num)
	{ 	
		   jsonArray = JSONArray.fromObject(finnal_String);
		   jsonObj  = JSONObject.fromObject(jsonArray.getString(num));  
		   return jsonObj.getString("QQ");
	}
	public String rePersonalLanguage(int num)
	{ 	
		   jsonArray = JSONArray.fromObject(finnal_String);
		   jsonObj  = JSONObject.fromObject(jsonArray.getString(num));  
		   return jsonObj.getString("personalLanguage");
	}


	public void writeTxt(Student [] Stu) 
	{
		for(int j = 0;j<300;j++)
		{
			jsonObjWrite[j] = new JSONObject();
			
		}
		String [] name = new String[300];
		String [] address = new String[300];
		String [] phoneNumber = new String[300];
		String [] weChat = new String[300];
		String [] mail = new String[300];
		String [] QQ = new String[300];
		String [] personalLanguage = new String[300];
		for(int i = 0,len = 0;i<300;i++)
		{
			if(Stu[i]!=null)
			{
			if(Stu[i].getName()!=null)
			{
				size++;
				name[i] = Stu[i].getName();
				address[i] = Stu[i].getAddress();
				phoneNumber[i] = Stu[i].getPhoneNumber();
				weChat[i] = Stu[i].getWeChat();
				mail[i] = Stu[i].getMail();
				QQ[i] = Stu[i].getQQ();
				personalLanguage[i] = Stu[i].getPersonalLanguage();
			}
			else
			{
				continue;
			}
		
		
			jsonObjWrite[len].put("name", name[i]);
			jsonObjWrite[len].put("address", address[i]);
			jsonObjWrite[len].put("phoneNumber", phoneNumber[i]);
			jsonObjWrite[len].put("weChat", weChat[i]);
			jsonObjWrite[len].put("mail", mail[i]);
			jsonObjWrite[len].put("QQ", QQ[i]);
			jsonObjWrite[len++].put("personalLanguage", personalLanguage[i]);	
			}
		}
		jsonObjWrite = reNoNullJson(jsonObjWrite,size);
		jsonArray = jsonArray.fromObject(jsonObjWrite);
		
		
		try {   	    
		    File writename = new File(".\\studentNote.txt");
	        writename.createNewFile(); // 创建新文件  
	        BufferedWriter out = new BufferedWriter(new FileWriter(writename)); 
	        out.write(jsonArray.toString());  
	        out.flush(); // 把缓存区内容压入文件  
	        out.close(); // 最后记得关闭文件  

	        
	    }
		catch (Exception e) {
	        e.printStackTrace();
	    }

}
		
		
		

	
	private JSONObject [] reNoNullJson(JSONObject[] jsonObject,int num) {		
		JSONObject[] stringArray = (JSONObject[]) Array.newInstance(JSONObject.class, num);
		for(int i = 0;i<num;i++)
		{
			stringArray[i] = jsonObject[i];
		}
		return stringArray;
	}
	
	
	
	/*public static void main(String[] args) {
		Txt_Translate TT = new Txt_Translate();
		Student [] Stu = new Student[300];
		TT.readTxt();
		for(int i = 0 ; i<TT.reAllStuJson(); i ++)
		{
		
			Stu[i] = new Student();
			Stu[i].initStudent(TT.reName(i), TT.reAddress(i), TT.rePhoneNumber(i),  TT.reMail(i),TT.reWeChat(i), TT.reQQ(i),TT.rePersonalLanguage(i));
		}
		
		
		TT.writeTxt(Stu);
		
	}*/
}
