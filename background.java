package randCharGen;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class background extends JPanel implements ActionListener
{
	String Race = "", Class = "", Strength = "", Dexterity = "", Constitution = "", Intelligence = "", Wisdom = "", Charisma = "", Background = "", Racials = "";
	int age = 0;
	Random rand = new Random();
	JLabel text;
	JComboBox<String> cr;

	public background()
	{
		setLayout(new BorderLayout());
		JButton button = new JButton();
		button.setText("PreGen");
		button.addActionListener(this);
		add(button, BorderLayout.NORTH);

		text = new JLabel();
		text.setText(String.format(
				"<html>Race:%s<br/>Age:%d<br/>Class:%s<br/>Strength:%s<br/>Dexterity:%s<br/>Constitution:%s<br/>Intelligence:%s<br/>Wisdom:%s<br/>Charisma:%s<br/>Background:%s<br/>Racial Traits:%s<br/></html>",
				Race, age, Class, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, Background, Racials));
		JPanel textpanel = new JPanel();
		add(textpanel, BorderLayout.CENTER);
		textpanel.add(text, BorderLayout.CENTER);
	}

	public void preGen()
	{
		Race = "";
		Class = "";
		Strength = "";
		Dexterity = "";
		Constitution = "";
		Intelligence = "";
		Wisdom = "";
		Charisma = "";
		Background = "";
		Racials = "";
		age = 0;

		// Ability Scores
		int[] standardArray = new int[]
		{ 15, 14, 13, 12, 10, 8 };
		RandomizeArray(standardArray);
		Strength += standardArray[0];
		Dexterity += standardArray[1];
		Constitution += standardArray[2];
		Intelligence += standardArray[3];
		Wisdom += standardArray[4];
		Charisma += standardArray[5];

		// Race
		String[] raceArray = new String[]
		{ "Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tiefling" };
		int i = rand.nextInt(raceArray.length);
		Race = raceArray[i];

		// Class
		String[] classArray = new String[]
		{ "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard" };
		i = rand.nextInt(classArray.length);
		Class = classArray[i];

		// Background
		String[] bgArray = new String[]
		{ "Acolyte", "Charlatan", "Criminal", "Entertainer", "Folk Hero", "Guild Artisan", "Hermit", "Noble", "Outlander", "Sage", "Sailor", "Soldier" };
		i = rand.nextInt(bgArray.length);
		Background = bgArray[i];

		// age and racials
		switch (Race)
		{
		case "Dwarf":
			Constitution += "+2";
			age = rand.nextInt(350 - 50 + 1) + 50;
			Racials += "<br/>-Darkvision<br/>-Speed:25<br/>-Dwarven Resilience<br/>-Dwarven Combat Training<br/>-Stonecunning<br/>-Languages: Common and Dwarven<br/>-Proficiency with ";
			int toolprof = rand.nextInt(3) + 1;
			switch (toolprof)
			{
			case 1:
				Racials += "Smith's tools<br/>";
				break;
			case 2:
				Racials += "Brewer's Supplies<br/>";
				break;
			case 3:
				Racials += "Mason's Tools<br/>";
				break;
			}
			int subrace = rand.nextInt(2);
			switch (subrace)
			{
			case 0:
				Wisdom += "+1";
				Racials += "-Dwarven Toughness<br/>";
				break;
			case 1:
				Strength += "+2";
				Racials += "-Dwarven Armor Training<br/>";
				break;
			}
			break;
		case "Elf":
			Dexterity += "+2";
			age = rand.nextInt(750 - 100 + 1) + 100;
			Racials += "<br/>-Darkvision<br/>-Speed:30<br/>-Keen Senses<br/>-Fey Ancestry<br/>-Trance<br/>-Languages: Common and Elvish, plus one more<br/>";
			subrace = rand.nextInt(3);
			switch (subrace)
			{
			case 0:
				Intelligence += "+1";
				Racials += "-Elf Weapon Training<br/>-One Wizard Cantrip<br/>";
				break;
			case 1:
				Wisdom += "+1";
				Racials += "-Elf Weapon Training<br/>-Fleet of Foot (+5 speed)<br/>-Mask of the Wild";
				break;
			case 2:
				Charisma += "+1";
				Racials += "-Superior Darkvision (+60ft)<br/>-Sunlight Sensitivity<br/>-Drow Magic<br/>-Drow Weapon Training";
				break;
			}
			break;
		case "Halfling":
			break;
		case "Human":
			break;
		case "Dragonborn":
			break;
		case "Gnome":
			break;
		case "Half-Elf":
			break;
		case "Half-Orc":
			break;
		case "Tiefling":

			break;
		}

		repaint();
	}

	public static int[] RandomizeArray(int[] standardArray)
	{
//		needed to randomise ability scores
		for (int i = 0; i < standardArray.length; i++)
		{
			Random rand = new Random();
			int randomPosition = rand.nextInt(standardArray.length);
			int temp = standardArray[i];
			standardArray[i] = standardArray[randomPosition];
			standardArray[randomPosition] = temp;
//		    System.out.println(standardArray[i]+ " " + temp);
		}

		return standardArray;
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		text.setText(String.format(
				"<html>Race:%s<br/>Age:%d<br/>Class:%s<br/>Strength:%s<br/>Dexterity:%s<br/>Constitution:%s<br/>Intelligence:%s<br/>Wisdom:%s<br/>Charisma:%s<br/>Background:%s<br/>Racial Traits:%s<br/></html>",
				Race, age, Class, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, Background, Racials));
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		preGen();
	}

}