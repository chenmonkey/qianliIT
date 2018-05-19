package zuJian;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class WindowMenu extends JFrame{
	JMenuBar menubar;
	JMenu menu,subMenu;
	JMenuItem item1,item2;
	
	public WindowMenu(){
		
	}

	public WindowMenu(String s, int x, int y, int w, int h) {
		init(s);
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	 void init(String s) {
		setTitle(s);
		menubar=new JMenuBar();
		menu=new JMenu("菜单");
		subMenu=new JMenu("软件项目");
		item1=new JMenuItem("Java话题",new ImageIcon("a.jpg"));
		item2=new JMenuItem("动画话题",new ImageIcon("c.jpg"));
		item1.setAccelerator(KeyStroke.getKeyStroke('A'));
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));//设置ctrl+s快捷键
		menu.add(item1);
		menu.addSeparator();//设置菜单中横线分隔符号(即两个菜单之间的分隔符)
		menu.add(item2);
		menu.add(subMenu);
		subMenu.add(new JMenuItem("汽车销售系统",new ImageIcon("b.jpg")));
		subMenu.add(new JMenuItem("农场信息系统",new ImageIcon("b.jpg")));
		menubar.add(menu);
		setJMenuBar(menubar);
		
		
	}
	
	 public static void main(String args[]){
			new WindowMenu("带菜单的窗口",20,30,200,190);
		}
}
