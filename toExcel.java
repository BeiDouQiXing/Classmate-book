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
			//ָ���洢·�����ļ���
			WritableWorkbook book = Workbook.createWorkbook(new File("./ͬѧ¼.xls"));
			//ָ��������0
			WritableSheet sheet = book.createSheet("sheet", 0);
			
			//����±�����ֶ� ��new Lable(�У��У�����)��
			sheet.addCell(new Label(0, 0, "����"));
			sheet.addCell(new Label(1, 0, "��ַ"));
			sheet.addCell(new Label(2, 0, "�绰"));
			sheet.addCell(new Label(3, 0, "΢��"));
			sheet.addCell(new Label(4, 0, "����"));
			sheet.addCell(new Label(5, 0, "QQ"));
			sheet.addCell(new Label(6, 0, "��������"));

			//��������
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
	
					//ѭ������һ�������ó�������ӵ��½���
	
					//����������͵����ݣ�getContents()�õ�����String���͵����ݣ�
					sheet.addCell( new Label(0, i+1, name) );
					sheet.addCell( new Label(1, i+1, address) );
					sheet.addCell( new Label(2, i+1, phoneNumber) );
					sheet.addCell( new Label(3, i+1, weChat) );
					sheet.addCell( new Label(4, i+1, mail) );
					sheet.addCell( new Label(5, i+1, QQ) );
					sheet.addCell( new Label(6, i+1, personalLanguage) );
				}
			}
			//���д��
			book.write();
			//�ر�
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
