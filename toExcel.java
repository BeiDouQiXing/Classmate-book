package toExcel2;
import java.io.File;
import jxl.Cell;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class toExcel {

	public void toExcels(Student [] Stu)
	{
		try {
			//指定存储路径和文件名
			WritableWorkbook book = Workbook.createWorkbook(new File("./同学录.xls"));
			//指定创建表0
			WritableSheet sheet = book.createSheet("sheet", 0);
			
			//添加新表各列字段 【new Lable(列，行，数据)】
			sheet.addCell(new Label(0, 0, "姓名"));
			sheet.addCell(new Label(1, 0, "地址"));
			sheet.addCell(new Label(2, 0, "电话"));
			sheet.addCell(new Label(3, 0, "微信"));
			sheet.addCell(new Label(4, 0, "邮箱"));
			sheet.addCell(new Label(5, 0, "QQ"));
			sheet.addCell(new Label(6, 0, "个性语言"));

			//填入内容
			for(int  i = 0; i < Stu.length ; i++){
				if(Stu[i].getName()!="")
				{
					String name = Stu[i].getName();
					String address = Stu[i].getAddress();
					String phoneNumber =Stu[i].getPhoneNumber();
					String weChat = Stu[i].getWeChat();
					String mail = Stu[i].getMail();
					String QQ = Stu[i].getQQ();
					String personalLanguage = Stu[i].getPersonalLanguage();
	
					//循环往第一个表中拿出数据添加到新建表
	
					//添加数字类型的数据（getContents()得到的是String类型的数据）
					sheet.addCell( new Label(0, i+1, name) );
					sheet.addCell( new Label(1, i+1, address) );
					sheet.addCell( new Label(2, i+1, phoneNumber) );
					sheet.addCell( new Label(3, i+1, weChat) );
					sheet.addCell( new Label(4, i+1, mail) );
					sheet.addCell( new Label(5, i+1, QQ) );
					sheet.addCell( new Label(6, i+1, personalLanguage) );
				}
			}
			//表的写入
			book.write();
			//关闭
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
