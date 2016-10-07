package Game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends JFrame {

	private JButton nytSpilBut = new JButton("Exit");
	private JButton dicebut = new JButton("Roll the dice");

	public JLabel player1Lab = new JLabel("Spiller 1 Point:");
	public JLabel PointPlayer1 = new JLabel("0");
	public JLabel Player2Lab = new JLabel("Spiller 2 Point:");
	public JLabel PointPlayer2 = new JLabel("0");
	public JLabel infoLab = new JLabel("Let Play!");
	public JLabel turnLab = new JLabel("Player 1 turn");


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
		nytSpilBut.setBounds(280,130, 110,25);
		dicebut.setBounds(280,100, 110,25);

		player1Lab.setBounds(20,10,100,20);
		PointPlayer1.setBounds(20,25,100,20);
		Player2Lab.setBounds(220,10,100,20);
		PointPlayer2.setBounds(220,25,100,20);
		infoLab.setBounds(20,140,150,20);
		turnLab.setBounds(20,100,150,20);

		add(nytSpilBut);
		add(dicebut);

		add(player1Lab);
		add(PointPlayer2);
		add(PointPlayer1);
		add(Player2Lab);
		add(infoLab);
		add(turnLab);


	}

	private void initEvent(){

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(1);
			}
		});

		nytSpilBut.addActionListener(new ActionListener() {
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


	public void btndiceClick(ActionEvent evt){
		GameController.click = true;
		System.out.println("click: " + GameController.click);
	}
}

