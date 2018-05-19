package practice;
//�Լ�����һ��������ʹ֮�ﵽb.subString������Ч��
public class Text4 {
	
public static void main(String args[]){
	Text4 text=new Text4();
	String c="我也喜欢学习";
	text.subString(c, 1, 4);
}
void subString(String b,int start,int end){
	
	char a[]=b.toCharArray();
	for(int i=start;i<end;i++)
	System.out.print(a[i]);
}
}
