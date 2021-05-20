package Random_Character_Generator;

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
		switch (Background)
		{
		case "Acolyte":
			Background += "<br/>-Skills: Insight, Religion<br/>-Languages: Two of choice<br/>--Equipment:<br/>--A holy symbol<br/>--a prayerbook/wheel<br/>--5 sticks of incense<br/>--vestments<br/>--common clothes<br/>--belt pouch of 15GP";
			Background += "<br/>-Feature: Shelter of the faithful";
			int trait = rand.nextInt(8), ideal = rand.nextInt(6), bond = rand.nextInt(6), flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait: I idolize a particular hero of my faith, and constantly refer to that person’s deeds and example.";
				break;
			case 1:
				Background += "<br/>Trait: I can find common ground between the fiercest enemies, empathizing and always workign toward peace";
				break;
			case 2:
				Background += "<br/>Trait: I see omens in every event and action. The gods try to speak to us, we just need to listen";
				break;
			case 3:
				Background += "<br/>Trait: Nothing can shake my optimistic attitude.";
				break;
			case 4:
				Background += "<br/>Trait: I quote (or misquote) sacred texts and proverbs in almost every situation.";
				break;
			case 5:
				Background += "<br/>Trait: I am tolerant (or intolerant) of other faiths and respect (or condemn) the worship of other gods.";
				break;
			case 6:
				Background += "<br/>Trait: I've enjoyed fine food, drink, and high society among my temple’s elite. Rough living grates on me.";
				break;
			case 7:
				Background += "<br/>Trait: I’ve spent so long in the temple that I have little practical experience dealing with people in the outside world.";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}
			break;
		case "Charlatan":
			Background += "<br/>Skills: <br/>Equipment: ";
			Background += "<br/>Feature: ";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait:";
				break;
			case 1:
				Background += "<br/>Trait:";
				break;
			case 2:
				Background += "<br/>Trait:";
				break;
			case 3:
				Background += "<br/>Trait:";
				break;
			case 4:
				Background += "<br/>Trait:";
				break;
			case 5:
				Background += "<br/>Trait:";
				break;
			case 6:
				Background += "<br/>Trait:";
				break;
			case 7:
				Background += "<br/>Trait:";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}
			break;
		case "Criminal":
			Background += "<br/>Skills: <br/>Equipment: ";
			Background += "<br/>Feature: ";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait:";
				break;
			case 1:
				Background += "<br/>Trait:";
				break;
			case 2:
				Background += "<br/>Trait:";
				break;
			case 3:
				Background += "<br/>Trait:";
				break;
			case 4:
				Background += "<br/>Trait:";
				break;
			case 5:
				Background += "<br/>Trait:";
				break;
			case 6:
				Background += "<br/>Trait:";
				break;
			case 7:
				Background += "<br/>Trait:";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}

			break;
		case "Entertainer":
			Background += "<br/>Skills: <br/>Equipment: ";
			Background += "<br/>Feature: ";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait:";
				break;
			case 1:
				Background += "<br/>Trait:";
				break;
			case 2:
				Background += "<br/>Trait:";
				break;
			case 3:
				Background += "<br/>Trait:";
				break;
			case 4:
				Background += "<br/>Trait:";
				break;
			case 5:
				Background += "<br/>Trait:";
				break;
			case 6:
				Background += "<br/>Trait:";
				break;
			case 7:
				Background += "<br/>Trait:";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}

			break;
		case "Folk Hero":
			Background += "<br/>Skills: <br/>Equipment: ";
			Background += "<br/>Feature: ";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait:";
				break;
			case 1:
				Background += "<br/>Trait:";
				break;
			case 2:
				Background += "<br/>Trait:";
				break;
			case 3:
				Background += "<br/>Trait:";
				break;
			case 4:
				Background += "<br/>Trait:";
				break;
			case 5:
				Background += "<br/>Trait:";
				break;
			case 6:
				Background += "<br/>Trait:";
				break;
			case 7:
				Background += "<br/>Trait:";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}

			break;
		case "Guild Artisan":
			Background += "<br/>Skills: <br/>Equipment: ";
			Background += "<br/>Feature: ";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait:";
				break;
			case 1:
				Background += "<br/>Trait:";
				break;
			case 2:
				Background += "<br/>Trait:";
				break;
			case 3:
				Background += "<br/>Trait:";
				break;
			case 4:
				Background += "<br/>Trait:";
				break;
			case 5:
				Background += "<br/>Trait:";
				break;
			case 6:
				Background += "<br/>Trait:";
				break;
			case 7:
				Background += "<br/>Trait:";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}

			break;
		case "Hermit":
			Background += "<br/>Skills: <br/>Equipment: ";
			Background += "<br/>Feature: ";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait:";
				break;
			case 1:
				Background += "<br/>Trait:";
				break;
			case 2:
				Background += "<br/>Trait:";
				break;
			case 3:
				Background += "<br/>Trait:";
				break;
			case 4:
				Background += "<br/>Trait:";
				break;
			case 5:
				Background += "<br/>Trait:";
				break;
			case 6:
				Background += "<br/>Trait:";
				break;
			case 7:
				Background += "<br/>Trait:";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}

			break;
		case "Noble":
			Background += "<br/>Skills: <br/>Equipment: ";
			Background += "<br/>Feature: ";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait:";
				break;
			case 1:
				Background += "<br/>Trait:";
				break;
			case 2:
				Background += "<br/>Trait:";
				break;
			case 3:
				Background += "<br/>Trait:";
				break;
			case 4:
				Background += "<br/>Trait:";
				break;
			case 5:
				Background += "<br/>Trait:";
				break;
			case 6:
				Background += "<br/>Trait:";
				break;
			case 7:
				Background += "<br/>Trait:";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}

			break;
		case "Outlander":
			Background += "<br/>Skills: <br/>Equipment: ";
			Background += "<br/>Feature: ";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait:";
				break;
			case 1:
				Background += "<br/>Trait:";
				break;
			case 2:
				Background += "<br/>Trait:";
				break;
			case 3:
				Background += "<br/>Trait:";
				break;
			case 4:
				Background += "<br/>Trait:";
				break;
			case 5:
				Background += "<br/>Trait:";
				break;
			case 6:
				Background += "<br/>Trait:";
				break;
			case 7:
				Background += "<br/>Trait:";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}

			break;
		case "Sage":
			Background += "<br/>Skills: <br/>Equipment: ";
			Background += "<br/>Feature: ";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait:";
				break;
			case 1:
				Background += "<br/>Trait:";
				break;
			case 2:
				Background += "<br/>Trait:";
				break;
			case 3:
				Background += "<br/>Trait:";
				break;
			case 4:
				Background += "<br/>Trait:";
				break;
			case 5:
				Background += "<br/>Trait:";
				break;
			case 6:
				Background += "<br/>Trait:";
				break;
			case 7:
				Background += "<br/>Trait:";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}

			break;
		case "Sailor":
			Background += "<br/>Skills: <br/>Equipment: ";
			Background += "<br/>Feature: ";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait:";
				break;
			case 1:
				Background += "<br/>Trait:";
				break;
			case 2:
				Background += "<br/>Trait:";
				break;
			case 3:
				Background += "<br/>Trait:";
				break;
			case 4:
				Background += "<br/>Trait:";
				break;
			case 5:
				Background += "<br/>Trait:";
				break;
			case 6:
				Background += "<br/>Trait:";
				break;
			case 7:
				Background += "<br/>Trait:";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}

			break;
		case "Soldier":
			Background += "<br/>Skills: <br/>Equipment: ";
			Background += "<br/>Feature: ";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait:";
				break;
			case 1:
				Background += "<br/>Trait:";
				break;
			case 2:
				Background += "<br/>Trait:";
				break;
			case 3:
				Background += "<br/>Trait:";
				break;
			case 4:
				Background += "<br/>Trait:";
				break;
			case 5:
				Background += "<br/>Trait:";
				break;
			case 6:
				Background += "<br/>Trait:";
				break;
			case 7:
				Background += "<br/>Trait:";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: ";
				break;
			case 1:
				Background += "<br/>Ideal: ";
				break;
			case 2:
				Background += "<br/>Ideal: ";
				break;
			case 3:
				Background += "<br/>Ideal: ";
				break;
			case 4:
				Background += "<br/>Ideal: ";
				break;
			case 5:
				Background += "<br/>Ideal: ";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: ";
				break;
			case 1:
				Background += "<br/>Bond: ";
				break;
			case 2:
				Background += "<br/>Bond: ";
				break;
			case 3:
				Background += "<br/>Bond: ";
				break;
			case 4:
				Background += "<br/>Bond: ";
				break;
			case 5:
				Background += "<br/>Bond: ";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: ";
				break;
			case 1:
				Background += "<br/>Flaw: ";
				break;
			case 2:
				Background += "<br/>Flaw: ";
				break;
			case 3:
				Background += "<br/>Flaw: ";
				break;
			case 4:
				Background += "<br/>Flaw: ";
				break;
			case 5:
				Background += "<br/>Flaw: ";
				break;
			}

			break;
		}

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
			Dexterity += "+2";
			age = rand.nextInt(150 - 20 + 1) + 20;
			Racials += "<br/>-Speed:25<br/>-Lucky<br/>-Brave<br/>-Halfling Nimbleness<br/>-Languages: Common and Halfling<br/>";
			subrace = rand.nextInt(2);
			switch (subrace)
			{
			case 0:
				Charisma += "+1";
				Racials += "-Naturally Stealthy";
				break;
			case 1:
				Constitution += "+1";
				Racials += "-Stout Resilience";
				break;
			}
			break;
		case "Human":
			age = rand.nextInt(85 - 17 + 1) + 17;
			subrace = rand.nextInt(2);
			Racials += "<br/>-Speed:30<br/>-Languages: Common, plus one more<br/>";
			switch (subrace)
			{
			case 0:
				Strength += "+1";
				Dexterity += "+1";
				Constitution += "+1";
				Intelligence += "+1";
				Wisdom += "+1";
				Charisma += "+1";
				break;
			case 1:
				Racials += "- +1 to two abilities of your choice<br/>-Profiency in one extra skill<br/>-One feat of choice<br/>";
				break;
			}
			break;
		case "Dragonborn":
			age = rand.nextInt(80 - 15 + 1) + 15;
			Strength += "+2";
			Charisma += "+1";
			Racials += "<br/>-Speed:30<br/>-Languages: Common and Draconic<br/>-Breath Weapon<br/>-Damage Resistance<br/>";
			subrace = rand.nextInt(10);
			switch (subrace)
			{
			case 0:
				Racials += "-Draconic Ancestry: Black";
				break;
			case 1:
				Racials += "-Draconic Ancestry: Blue";
				break;
			case 2:
				Racials += "-Draconic Ancestry: Brass";
				break;
			case 3:
				Racials += "-Draconic Ancestry: Bronze";
				break;
			case 4:
				Racials += "-Draconic Ancestry: Copper";
				break;
			case 5:
				Racials += "-Draconic Ancestry: Gold";
				break;
			case 6:
				Racials += "-Draconic Ancestry: Green";
				break;
			case 7:
				Racials += "-Draconic Ancestry: Red";
				break;
			case 8:
				Racials += "-Draconic Ancestry: Silver";
				break;
			case 9:
				Racials += "-Draconic Ancestry: White";
				break;
			}
			break;
		case "Gnome":
			Intelligence += "+2";
			age = rand.nextInt(400 - 40 + 1) + 40;
			Racials += "<br/>-Speed:25<br/>-Darkvision<br/>-Gnome Cunning<br/>-Languages: Common and Gnomish<br/>";
			subrace = rand.nextInt(2);
			switch (subrace)
			{
			case 0:
				Dexterity += "+1";
				Racials += "-Natural Illusionist<br/>-Speak with small beasts";
				break;
			case 1:
				Constitution += "+1";
				Racials += "-Artificer's lore<br/>-Tinker";
				break;
			}
			break;
		case "Half-Elf":
			age = rand.nextInt(180 - 20 + 1) + 20;
			Charisma += "+2";
			Racials += "<br/>-Ability Scores:+1 to two of your choice besides Charisma<br/>-Speed:30<br/>-Darkvision<br/>-Fey Ancestry<br/>-Proficiency in 2 extra skills<br/>-Languages: Common, Elvish, and one other";
			break;
		case "Half-Orc":
			Strength += "+2";
			Constitution += "+1";
			age = rand.nextInt(75 - 14 + 1) + 14;
			Racials += "<br/>-Speed:30<br/>-Darkvision<br/>-Proficiency in Intimidation<br/>-Reckless Endurance<br/>-Savage Attacks<br/>-Languages: Common and Orc";
			break;
		case "Tiefling":
			age = rand.nextInt(90 - 17 + 1) + 17;
			Charisma += "+2";
			Intelligence += "+1";
			Racials += "<br/>-Speed:30<br/>-Darkvision<br/>-Resistance to Fire<br/>-Infernal Legacy<br/>-Languages: Common and Infernal";
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