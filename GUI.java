package cha.MAIN;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener{
	JFrame frame;
	JTextField nameIn;
	JButton seasonFP, seasonStats, careerFP, careerStats;
	JPanel top, mid, bot;
	JLabel label, n, ret;
	JTable table;
	JScrollPane sp;
	
	//creates window
	GUI() {
		frame = new JFrame("Stats Finder");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		
		top = new JPanel();
		label = new JLabel("Enter player name, then pick which stats you would like to see", SwingConstants.CENTER);
		label.setPreferredSize(new Dimension(400, 20));
		top.add(label);
		
		mid = new JPanel();
		n = new JLabel("Name:");
		nameIn = new JTextField(30);
		mid.add(n);
		mid.add(nameIn);
		
		bot = new JPanel();
		seasonFP = new JButton("Season Fantasy Points");
		seasonStats = new JButton("Season Stats");
		careerFP = new JButton("Career Fantasy Points");
		careerStats = new JButton("Career Stats");
		
		seasonFP.addActionListener(this);
		seasonStats.addActionListener(this);
		careerFP.addActionListener(this);
		careerStats.addActionListener(this);
		
		bot.add(seasonFP);
		bot.add(seasonStats);
		bot.add(careerFP);
		bot.add(careerStats);
		
		frame.getContentPane().add(BorderLayout.NORTH, top);
		frame.getContentPane().add(BorderLayout.CENTER, mid);
		frame.getContentPane().add(BorderLayout.LINE_END, bot);
		
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	
	//when buttons are pressed, reads the data in the name input field and 
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		ret = new JLabel("");
		frame.getContentPane().add(BorderLayout.NORTH, ret);
		String name = nameIn.getText();
		Player p = new Player(name);
		p.scrape();
		p.calcCareerfppg();
		p.calcfppg();
		p.calcTotalFP();
		if(e.getSource() == seasonFP) {
			String[][] data = {
					{"Total Fantasy Points", Double.toString(p.getTotalFP())},
					{"Fantasy Points Per Game", Double.toString(p.getfppg())}
			};
			String[] column = {"",""};
			ret.setText(
					name + " Season Fantasy Points: \n"
					+ "Fantasy Points Values: Pts(1), Ast(1.5), Reb(1.2), Stl(3), Blk(3), Tov(-1)"
					);
			table = new JTable(data, column);
			sp = new JScrollPane(table);
			frame.getContentPane().add(BorderLayout.SOUTH, sp);
		}
		if(e.getSource() == seasonStats) {
			String[][] data = {
					{"Total Points", Double.toString(p.getTotalPoints())},
					{"Total Assists", Double.toString(p.getTotalAssists())},
					{"Total Rebounds", Double.toString(p.getTotalRebounds())},
					{"Total Blocks", Double.toString(p.getTotalBlocks())},
					{"Total Steals", Double.toString(p.getTotalSteals())},
					{"Total Turnovers", Double.toString(p.getTotalTurnovers())},
					{"Free Throw Percentage", Double.toString(p.getFTPercent())},
					{"Three Point Percentage", Double.toString(p.getThreePercent())},
					{"Field Goal Percentage", Double.toString(p.getFGPercent())},
					{"Points Per Game", Double.toString(p.getppg())},
					{"Rebounds Per Game", Double.toString(p.getrpg())},
					{"Assists Per Game", Double.toString(p.getapg())},
					{"Blocks Per Game", Double.toString(p.getbpg())},
					{"Steals Per Game", Double.toString(p.getspg())},
					{"Turnovers Per Game", Double.toString(p.gettpg())},
			};
			String[] column = {"",""};
			ret.setText(
					name + " Season Stats: \n"
					);
			table = new JTable(data,column);
			sp = new JScrollPane(table);
			frame.getContentPane().add(BorderLayout.SOUTH, sp);
		}
		if(e.getSource() == careerFP) {
			String[][] data = {
					{"Fantasy Points Per Game", Double.toString(p.getCareerfppg())}	
			};
			String[] column = {"",""};
			ret.setText(
					name + " Career Fantasy Points: \n"
					+ "Fantasy Points Values: Pts(1), Ast(1.5), Reb(1.2), Stl(3), Blk(3), Tov(-1)"
					);
			table = new JTable(data, column);
			sp = new JScrollPane(table);
			frame.getContentPane().add(BorderLayout.SOUTH, sp);
		}
		if(e.getSource() == careerStats) {
			String[][] data = {
					{"Free Throw Percentage", Double.toString(p.getFTPercent())},
					{"Three Point Percentage", Double.toString(p.getThreePercent())},
					{"Field Goal Percentage", Double.toString(p.getFGPercent())},
					{"Points Per Game", Double.toString(p.getppg())},
					{"Rebounds Per Game", Double.toString(p.getrpg())},
					{"Assists Per Game", Double.toString(p.getapg())},
					{"Blocks Per Game", Double.toString(p.getbpg())},
					{"Steals Per Game", Double.toString(p.getspg())},
					{"Turnovers Per Game", Double.toString(p.gettpg())},
			};
			String[] column = {"",""};
			ret.setText(
					name + " Career Stats: \n"
					);
			table = new JTable(data, column);
			sp = new JScrollPane(table);
			frame.getContentPane().add(BorderLayout.SOUTH, sp);
		}
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
}
