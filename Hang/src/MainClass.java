import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileFilter;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainClass extends JFrame implements ActionListener,MouseListener{
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Panel p4 = new Panel();
	TextArea ta = new TextArea("",20,35,TextArea.SCROLLBARS_NONE);
	Choice c = new Choice();
	Label l1 = new Label("File Explorer");
	Label l2 = new Label("");
	Label l3 = new Label("");
	Label l4 = new Label("");
	Label l5 = new Label("");
	Label l6 = new Label("");
	Label l7 = new Label("");
	Label l8 = new Label("");
	Label l9 = new Label("");
	Label l10 = new Label("");
	Label l11 = new Label("");
	Label l12 = new Label("");
	Label l13 = new Label("");
	Label l14 = new Label("");
	Label l15 = new Label("");
	Label l16 = new Label("");
	Label l17 = new Label("");
	Label l18 = new Label("");
	private String colName[] = {"Mo", "Name", "Size"};

	
	JTree tree;
	DefaultMutableTreeNode leaf3;
	DefaultTreeModel treeModel;
	
	public MainClass() {
		super("Tree Test Example");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("disk drive(C:)");
		treeModel = new DefaultTreeModel(root);
		tree = new JTree(treeModel);
		File dir = new File("\\");
		File[] files = dir.listFiles(); // 객체로 받기
		FileFilter fileFilter = new FileFilter() {
			public boolean accept(File file) { // 디렉토리 받기
				return file.isDirectory();
			}
		};
		files = dir.listFiles(fileFilter);
		if (files.length == 0) {
			System.out.println("Either dir does not exist or is not a directory");
		} else {
			for (int i = 0; i < files.length; i++) {
				File filename = files[i];
				if (filename.toString().contains("$") || filename.toString().contains("Recovery")
						|| filename.toString().contains("System") || filename.toString().contains("Temp")
						|| filename.toString().contains("PerfLogs"))

					continue;
				else {	
						Object a = filename;
						String w = a.toString();
						String e[] = w.split("\\\\");
						leaf3 = new DefaultMutableTreeNode(e[1]);
						root.add(leaf3);
					}
				}
			}
	 	c.addItem("English");
		c.addItem("한국어");
		add(p1,BorderLayout.SOUTH);
		add(p2,BorderLayout.WEST);
		add(p3,BorderLayout.NORTH);
		add(p4,BorderLayout.EAST);
		p1.add(l1);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		p1.add(l6);
		p1.add(l7);	
		p1.add(l8);	
		p1.add(l9);	
		p1.add(l10);	
		p1.add(l11);	
		p1.add(l12);	
		p1.add(l13);	
		p1.add(l14);
		p1.add(l15);
		p1.add(l16);
		p1.add(l17);
		p1.add(l18);
		
		p1.add(c);
		p2.add(tree);
		p3.add(l2);
		p4.add(ta);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
			if(arg0.equals(ch1)) {
				
			}
	}
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
