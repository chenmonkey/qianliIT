package zuJian;

import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
import javax.swing.event.*;
public class TreeWin extends JFrame implements TreeSelectionListener{
	 JTree tree;
	    JTextArea area;
	    TreeWin(){
	    	DefaultMutableTreeNode root=new DefaultMutableTreeNode("商品");//根结点
	    	DefaultMutableTreeNode nodeTV=new DefaultMutableTreeNode("电视类");//结点
	    	DefaultMutableTreeNode nodePhone=new DefaultMutableTreeNode("手机类");//结点
	    	
	    	DefaultMutableTreeNode tv1=new DefaultMutableTreeNode(new Goods("长虹电视",5699));//结点
	    	DefaultMutableTreeNode tv2=new DefaultMutableTreeNode(new Goods("海尔电视",7832));//结点
	    	DefaultMutableTreeNode phone1=new DefaultMutableTreeNode(new Goods("诺基亚手机",3600));//结点
	    	DefaultMutableTreeNode phone2=new DefaultMutableTreeNode(new Goods("三星手机",2155));//结点
	    	
	    	root.add(nodeTV);
	    	root.add(nodePhone);
	    	
	    	nodeTV.add(tv1);
	    	nodeTV.add(tv2);
	    	
	    	nodePhone.add(phone1);
	    	nodePhone.add(phone2);
	    	
	    	tree=new JTree(root);
	    	tree.addTreeSelectionListener(this);
	    	
	    	area=new JTextArea();
	    	setLayout(new GridLayout(1,2));
	    	
	    	add(new JScrollPane(tree));
	    	add(new JScrollPane(area));
	    	
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	setVisible(true);
	    	setBounds(80,80,300,300);
	    	validate();//使用 validate 方法会使容器再次布置其子组件。
	    	//已经布置容器后，在修改此容器的子组件的时候（在容器中添加或移除组件，或者更改与布局相关的信息），应该调用上述方法
	    }
		
		public void valueChanged(TreeSelectionEvent arg0) {
			DefaultMutableTreeNode node=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
			if(node.isLeaf()){
				Goods s=(Goods)node.getUserObject();//得到结点中存放的对象
				area.append(s.name+","+s.price+"元\n");
			}else{
				area.setText(null);
			}
			
		}
		public static void main(String args[]){
			TreeWin win=new TreeWin();
		}
	}
