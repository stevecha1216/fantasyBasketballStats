package cha.MAIN;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Player {
	private String name;
	private int number;
	private String team;
	private int totalPoints;
	private int totalRebounds;
	private int totalAssists;
	private int totalBlocks;
	private int totalSteals;
	private int totalTurnovers;
	private double ftPercent;
	private double threePercent;
	private double fgPercent;
	private double totalFP;
	private double ppg; //points per game
	private double rpg; //rebounds per game
	private double apg; //assists per game
	private double bpg; //blocks per game
	private double spg; //steals per game
	private double tpg; //turnovers per game
	private double fppg; //fantasy points per game
	private double careerppg;
	private double careerrpg;
	private double careerapg;
	private double careerbpg;
	private double careerspg;
	private double careertpg;
	private double careerfppg;
	private double careerFTPercent;
	private double careerThreePercent;
	private double careerFGPercent;
	
	
	public Player(){
		
	}
	
	public Player(String name) {
		this.name = name;
		
	}
	public void setNumber(int number) {this.number = number;}
	public int getNumber() {return(this.number);}
			
	public void setTeam(String team) {this.team = team;}
	public String getTeam() {return(this.team);}
	
	public void setTotalPoints(int totalPoints) {this.totalPoints = totalPoints;}
	public int getTotalPoints() {return(this.totalPoints);}
	
	public void setTotalRebounds(int totalRebounds) {this.totalRebounds = totalRebounds;}
	public int getTotalRebounds() {return(this.totalRebounds);}
	
	public void setTotalAssists(int totalAssists) {this.totalAssists = totalAssists;}
	public int getTotalAssists() {return(this.totalAssists);}
	
	public void setTotalBlocks(int totalBlocks) {this.totalBlocks = totalBlocks;}
	public int getTotalBlocks() {return(this.totalBlocks);}
	
	public void setTotalSteals(int totalSteals) {this.totalSteals = totalSteals;}
	public int getTotalSteals() {return(this.totalSteals);}
	
	public void setTotalTurnovers(int totalTurnovers) {this.totalTurnovers = totalTurnovers;}
	public int getTotalTurnovers() {return(this.totalTurnovers);}
	
	public void setFTPercent(double ftPercent) {this.ftPercent = ftPercent;}
	public double getFTPercent() {return(this.ftPercent);}
	
	public void setThreePercent(double threePercent) {this.threePercent = threePercent;}
	public double getThreePercent() {return(this.threePercent);}
	
	public void setFGPercent(double fgPercent) {this.fgPercent = fgPercent;}
	public double getFGPercent() {return(this.fgPercent);}
	
	public void setTotalFP(double totalFP) {this.totalFP = totalFP;}
	public double getTotalFP() {return(this.totalFP);}
	
	public void setppg(double ppg) {this.ppg = ppg;}
	public double getppg() {return(this.ppg);}
	
	public void setrpg(double rpg) {this.rpg = rpg;}
	public double getrpg() {return(this.rpg);}
	
	public void setapg(double apg) {this.apg = apg;}
	public double getapg() {return(this.apg);}
	
	public void setbpg(double bpg) {this.bpg = bpg;}
	public double getbpg() {return(this.bpg);}
	
	public void setspg(double spg) {this.spg = spg;}
	public double getspg() {return(this.spg);}
	
	public void settpg(double tpg) {this.tpg = tpg;}
	public double gettpg() {return(this.tpg);}
	
	public void setfppg(double fppg) {this.fppg = fppg;}
	public double getfppg() {return(this.fppg);}
	
	public void setCareerppg(double careerppg) {this.careerppg = careerppg;}
	public double getCareerppg() {return(this.careerppg);}
	
	public void setCareerrpg(double careerrpg) {this.careerrpg = careerrpg;}
	public double getCareerrpg() {return(this.careerrpg);}
	
	public void setCareerapg(double careerapg) {this.careerapg = careerapg;}
	public double getCareerapg() {return(this.careerapg);}
	
	public void setCareerbpg(double careerbpg) {this.careerbpg = careerbpg;}
	public double getCareerbpg() {return(this.careerbpg);}
	
	public void setCareerspg(double careerspg) {this.careerspg = careerspg;}
	public double getCareerspg() {return(this.careerspg);}
	
	public void setCareertpg(double careertpg) {this.careertpg = careertpg;}
	public double getCareertpg() {return(this.careertpg);}
	
	public void setCareerfppg(double careerfppg) {this.careerfppg = careerfppg;}
	public double getCareerfppg() {return(this.careerfppg);}
	
	public void setCareerFTPercent(double careerFTPercent) {this.careerFTPercent = careerFTPercent;}
	public double getCareerFTPercent() {return(this.careerFTPercent);}
	
	public void setCareerThreePercent(double careerThreePercent) {this.careerThreePercent = careerThreePercent;}
	public double getCareerThreePercent() {return(this.careerThreePercent);}
	
	public void setCareerFGPercent(double careerFGPercent) {this.careerFGPercent = careerFGPercent;}
	public double getCareerFGPercent() {return(this.careerFGPercent);}
	
	public void printCatStats() {
		System.out.println("Season Stats:");
		System.out.println("Total Points: " + this.totalPoints);
		System.out.println("Total Assists: " + this.totalAssists);
		System.out.println("Total Rebounds: " + this.totalRebounds);
		System.out.println("Total Blocks: " + this.totalBlocks);
		System.out.println("Total Steals: " + this.totalSteals);
		System.out.println("Total Turnovers: " + this.totalTurnovers);
		System.out.println("Free Throw Percentage: " + this.ftPercent + "%");
		System.out.println("Three Point Percentage: " + this.threePercent + "%");
		System.out.println("Field Goal Percentage: " + this.fgPercent + "%");
		System.out.println("Points Per Game: " + this.ppg);
		System.out.println("Rebounds Per Game: " + this.rpg);
		System.out.println("Assists Per Game: " + this.apg);
		System.out.println("Blocks Per Game: " + this.bpg);
		System.out.println("Steals Per Game: " + this.spg);
		System.out.println("Turnovers Per Game: " + this.tpg);
	}
	
	public void printPointsStats() {
		System.out.println("Season Stats:");
		System.out.println("Total Fantasy Points: " + this.totalFP);
		System.out.println("Fantasy Points Per Game: " + this.fppg);
	}
	
	public void printCareerCatStats() {
		System.out.println("Career Stats:");
		System.out.println("Free Throw Percentage: " + this.careerFTPercent + "%");
		System.out.println("Three Point Percentage: " + this.careerThreePercent + "%");
		System.out.println("Field Goal Percentage: " + this.careerFGPercent + "%");
		System.out.println("Points Per Game: " + this.careerppg);
		System.out.println("Rebounds Per Game: " + this.careerrpg);
		System.out.println("Assists Per Game: " + this.careerapg);
		System.out.println("Blocks Per Game: " + this.careerbpg);
		System.out.println("Steals Per Game: " + this.careerspg);
		System.out.println("Turnovers Per Game: " + this.careertpg);
	}
	
	public void printCareerPointsStats() {
		System.out.println("Career Stats:");
		System.out.println("Fantasy Points Per Game: " + this.careerfppg);
	}
	
	public void calcTotalFP() {
		int p = getTotalPoints();
		int r = getTotalRebounds();
		int a = getTotalAssists();
		int b = getTotalBlocks();
		int s = getTotalSteals();
		int t = getTotalTurnovers();
		double pfp = p; //fantasy points from points
		double rfp = (double) (r * 1.2); //fantasy points from rebounds
		double afp = (double) (a * 1.5); // fantasy points from assists
		double bfp = (double) (b * 3); // fantasy points from blocks
		double sfp = (double) (s * 3); // fantasy points from steals
		double tfp = t; //turnovers, subtract from total fp
		double totalFP = pfp + rfp + afp + bfp + sfp - tfp;
		setTotalFP(totalFP);
	}
	
	public void calcfppg() {
		double ppg = getppg();
		double rpg = getrpg() * 1.2;
		double apg = getapg() * 1.5;
		double bpg = getbpg() * 3;
		double spg = getspg() * 3;
		double tpg = gettpg();
		double fppg = ppg + rpg + apg + bpg + spg - tpg;
		setfppg(fppg);
	}
	
	public void calcCareerfppg() {
		double ppg = getCareerppg();
		double rpg = getCareerrpg() * 1.2;
		double apg = getCareerapg() * 1.5;
		double bpg = getCareerbpg() * 3;
		double spg = getCareerspg() * 3;
		double tpg = getCareertpg();
		double fppg = ppg + rpg + apg + bpg + spg - tpg;
		setCareerfppg(fppg);
	}
	
	public void scrape() {
		String name = this.name;
		String[] firstLast = name.split(" ");
		String[] first = firstLast[0].split("");
		String[] last = firstLast[firstLast.length - 1].split("");
		String x = "";
		int counter = 0;
		while(counter < 5) {
			x += last[counter];
			counter++; 
		}
		x += first[0] + first[1];
		x = x.toLowerCase();
		
		String url = "https://www.basketball-reference.com/players/" + last[0].toLowerCase() + "/" + x + "01.html";
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements eS = doc.getElementById("per_game.2022").select("*"); //per games of season
			Elements eC = doc.select("#per_game > tfoot > tr:nth-child(1)"); //per games of career
			Elements eST = doc.getElementById("totals.2022").select("td"); //totals of season
			
			//season
			setTotalPoints(Integer.valueOf(eST.select("[data-stat='pts']").text()));
			setTotalRebounds(Integer.valueOf(eST.select("[data-stat='trb']").text()));
			setTotalAssists(Integer.valueOf(eST.select("[data-stat='ast']").text()));
			setTotalBlocks(Integer.valueOf(eST.select("[data-stat='blk']").text()));
			setTotalSteals(Integer.valueOf(eST.select("[data-stat='stl']").text()));
			setTotalTurnovers(Integer.valueOf(eST.select("[data-stat='tov']").text()));
			
			setFTPercent(Double.valueOf(eS.select("[data-stat='ft_pct']").text()));
			setThreePercent(Double.valueOf(eS.select("[data-stat='fg3_pct']").text()));
			setFGPercent(Double.valueOf(eS.select("[data-stat='fg_pct']").text()));
			setppg(Double.valueOf(eS.select("[data-stat='pts_per_g']").text()));
			setrpg(Double.valueOf(eS.select("[data-stat='trb_per_g']").text()));
			setapg(Double.valueOf(eS.select("[data-stat='ast_per_g']").text()));
			setbpg(Double.valueOf(eS.select("[data-stat='blk_per_g']").text()));
			setspg(Double.valueOf(eS.select("[data-stat='stl_per_g']").text()));
			settpg(Double.valueOf(eS.select("[data-stat='tov_per_g']").text()));
			
			//career
			setCareerppg(Double.valueOf(eC.select("[data-stat='pts_per_g']").text()));
			setCareerapg(Double.valueOf(eC.select("[data-stat='ast_per_g']").text()));
			setCareerrpg(Double.valueOf(eC.select("[data-stat='trb_per_g']").text()));
			setCareerbpg(Double.valueOf(eC.select("[data-stat='blk_per_g']").text()));
			setCareerspg(Double.valueOf(eC.select("[data-stat='stl_per_g']").text()));
			setCareertpg(Double.valueOf(eC.select("[data-stat='tov_per_g']").text()));
			setCareerFTPercent(Double.valueOf(eC.select("[data-stat='ft_pct']").text()));
			setCareerFGPercent(Double.valueOf(eC.select("[data-stat='fg_pct']").text()));
			setCareerThreePercent(Double.valueOf(eC.select("[data-stat='fg3_pct']").text()));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		calcTotalFP();
		calcfppg();
		calcCareerfppg();
	}
}
