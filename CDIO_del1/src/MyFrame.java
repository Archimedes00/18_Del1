import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public static void main(String[] args) {
		MyFrame f = new MyFrame();
		f.setVisible(true);
		}


class MyFrame extends JFrame {

	private JButton NytSpilBut = new JButton("Nyt Spil");
	private JButton dicebut = new JButton("Roll the dice");

	private JLabel player1Lab = new JLabel("Spiller 1 Point:");
	private JLabel PointPlayer1 = new JLabel("0");
	private JLabel Player2Lab = new JLabel("Spiller 2 Point:");
	private JLabel PointPlayer2 = new JLabel("0");
	private JLabel infoLab = new JLabel("Spillet starter....");


	public MyFrame(){
		setTitle("Dice Game - Gruppe 18");
		setSize(400,200);
		setLocation(new Point(300,200));
		setLayout(null);    
		setResizable(false);

		initComponent();    
		initEvent();    
	}

	private void initComponent(){
		NytSpilBut.setBounds(300,130, 70,25);
		dicebut.setBounds(280,100, 110,25);

		player1Lab.setBounds(20,10,100,20);
		PointPlayer1.setBounds(20,25,100,20);
		Player2Lab.setBounds(220,10,100,20);
		PointPlayer2.setBounds(220,25,100,20);
		infoLab.setBounds(20,140,100,20);

		add(NytSpilBut);
		add(dicebut);

		add(player1Lab);
		add(PointPlayer2);
		add(PointPlayer1);
		add(Player2Lab);
		add(infoLab);

	}

	private void initEvent(){

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(1);
			}
		});

		NytSpilBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnstopClick(e);
			}
		});

		dicebut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btndiceClick(e);
			}
		});
	}

	private void btnstopClick(ActionEvent evt){
		System.exit(0); // stopper programmet på Knapper Nyt spil
	}

	private void btndiceClick(ActionEvent evt){
		System.out.println("click"); // udkskriver Click ved Tryk på knaps

	}
}

