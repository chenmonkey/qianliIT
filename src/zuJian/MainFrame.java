package zuJian;




import javax.swing.*;


public class MainFrame extends JFrame {
	
	public MainFrame() {
        super("主页");
        setSize(300, 300);
        //菜单设置
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu menu1 = new JMenu("联系人");
        JMenu menu101 = new JMenu("朋友");
        JMenuItem menu10101 = new JMenuItem("徐又欠");
        JMenuItem menu10102 = new JMenuItem("纸官");
        JMenuItem menu10103 = new JMenuItem("饶清");
        JMenuItem menu10104 = new JMenuItem("小陶");
        JMenuItem menu10105 = new JMenuItem("坨儿");
        JMenuItem menu102 = new JMenuItem("家人");
      
        menu101.add(menu10101);
        menu101.add(menu10102);
        menu101.add(menu10103);
        menu101.add(menu10104);
        menu101.add(menu10105);
        menu1.add(menu101);
        menu1.add(menu102);
        JMenu menu2 = new JMenu("群聊");
        JMenu menu3 = new JMenu("讨论组");
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
 
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MainFrame();
    }
}