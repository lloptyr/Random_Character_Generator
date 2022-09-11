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
				Background += "<br/>Trait: I idolize a particular hero of my faith, and constantly refer to that person's deeds and example.";
				break;
			case 1:
				Background += "<br/>Trait: I can find common ground between the fiercest enemies, empathizing and always working toward peace";
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
				Background += "<br/>Trait: I've enjoyed fine food, drink, and high society among my temple's elite. Rough living grates on me.";
				break;
			case 7:
				Background += "<br/>Trait: I've spent so long in the temple that I have little practical experience dealing with people in the outside world.";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: Tradition. The ancient traditions of worship and sacrifice must be preserved and upheld.";
				break;
			case 1:
				Background += "<br/>Ideal: Charity. I always try to help those in need, no matter what the personal cost.";
				break;
			case 2:
				Background += "<br/>Ideal: Change. We must help bring about the changes the gods are constantly working in the world.";
				break;
			case 3:
				Background += "<br/>Ideal: Power. I hope to one day rise to the top of my faith's religious hierarchy.";
				break;
			case 4:
				Background += "<br/>Ideal: Faith. I trust that my deity will guide my actions, I have faith that if I work hard, things will go well.";
				break;
			case 5:
				Background += "<br/>Ideal: Aspiration. I seek to prove myself worthy of my god's favor by matching my actions against their teachings.";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: I would die to recover an ancient relic of my faith that was lost long ago.";
				break;
			case 1:
				Background += "<br/>Bond: I will someday get revenge on the corrupt temple hierarchy who branded me a heretic.";
				break;
			case 2:
				Background += "<br/>Bond: I owe my life to the priest who took me in when my parents died.";
				break;
			case 3:
				Background += "<br/>Bond: Everything I do is for the common people.";
				break;
			case 4:
				Background += "<br/>Bond: I will do anything to protect the temple where I served.";
				break;
			case 5:
				Background += "<br/>Bond: I seek to preserve a sacred text that my enemies consider heretical and seek to destroy.";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: I judge others harshly, and myself even more severely.";
				break;
			case 1:
				Background += "<br/>Flaw: I put too much trust in those who wield power within my temple's hierarchy.";
				break;
			case 2:
				Background += "<br/>Flaw: My piety sometimes leads me to blindly trust those that profess faith in my god.";
				break;
			case 3:
				Background += "<br/>Flaw: I am inflexible in my thinking.";
				break;
			case 4:
				Background += "<br/>Flaw: I am suspicious of strangers and expect the worst of them.";
				break;
			case 5:
				Background += "<br/>Flaw: Once I pick a goal, I become obsessed with it to the detriment of everything else in my life.";
				break;
			}
			break;
		case "Charlatan":
			Background += "<br/>Skills: Deception, Sleight of hand<br/>Tool Proficiencies: Disguise kit, Forgery kit<br/>Equipment:<br/>--Fine Clothes<br/>--Disguise Kit<br/>--Tools of a con<br/>Belt Pouch of 15Gp<br/>";
			Background += "<br/>Feature: False Identity<br/>";
			int scam =rand.nextInt(6);
			switch (scam)
			{
			case 0: Background+="Scam: I cheat at games of chance.";
			break;
			case 1: Background+="Scam: I shave coins or forge documents.";
			break;
			case 2: Background+="Scam: I insinuate myself into people's lives to prey on their weakness and secure their fortunes.";
			break;
			case 3: Background+="Scam: I put on new identities like clothes.<br/>";
			break;
			case 4: Background+="Scam: I run sleight-of-hand cons on street corners.<br/>";
			break;
			case 5: Background+="Scam: I convince people that worthless junk is worth their hard-earned money.";
			break;
			}
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait: I fall in and out of love easily, and am always pursuing someone.";
				break;
			case 1:
				Background += "<br/>Trait: I have a joke for every occasion, especially occasions where humor is inappropriate.";
				break;
			case 2:
				Background += "<br/>Trait: Flattery is my preferred trick for getting what I want.";
				break;
			case 3:
				Background += "<br/>Trait: I'm a born gambler who can't resist taking a risk for a potential payoff.";
				break;
			case 4:
				Background += "<br/>Trait: I lie about almost everything, even when there's no good reason to.";
				break;
			case 5:
				Background += "<br/>Trait: Sarcasm and insults are my weapons of choice.";
				break;
			case 6:
				Background += "<br/>Trait: I keep multiple holy symbols on me and invoke whatever deity might come in useful at any given moment.";
				break;
			case 7:
				Background += "<br/>Trait: I pocket anything I see that might have some value.";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: Independence. I am a free spirit. no one tells me what to do.";
				break;
			case 1:
				Background += "<br/>Ideal: Fairness. I never target people who can't afford to lose a few coins.";
				break;
			case 2:
				Background += "<br/>Ideal: Charity. I distribute the money I acquire to the people who really need it.";
				break;
			case 3:
				Background += "<br/>Ideal: Creativity. I never run the same con twice.";
				break;
			case 4:
				Background += "<br/>Ideal: Friendship. Material goods come and go. Bonds of friendship last forever.";
				break;
			case 5:
				Background += "<br/>Ideal: Aspiration. I'm determined to make something of myself.";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: I fleeced the wrong person and must work to ensure that this individual never crosses paths with me or those I care about.";
				break;
			case 1:
				Background += "<br/>Bond: I owe everything to my mentor, a horrible person who's probably rotting in jail somewhere.";
				break;
			case 2:
				Background += "<br/>Bond: Somewhere out there, I have a child who doesn't know me. I'm making the world better for them.";
				break;
			case 3:
				Background += "<br/>Bond: I come from a noble family, and one day I'll reclaim my lands and title from those who stole them from me.";
				break;
			case 4:
				Background += "<br/>Bond: A powerful person killed someone I love. Some day soon, I'll have my revenge.";
				break;
			case 5:
				Background += "<br/>Bond: I swindled and ruined a person who didn't deserve it. I seek to atone for my misdeeds but might never be able to forgive myself.";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: I can't resist a pretty face.";
				break;
			case 1:
				Background += "<br/>Flaw: I'm always in debt. I spend my ill-gotten gains on decadent luxuries faster than I bring them in..";
				break;
			case 2:
				Background += "<br/>Flaw: I'm convinced that no one could ever fool me the way I fool others.";
				break;
			case 3:
				Background += "<br/>Flaw: I'm too greedy for my own good. I can't resist taking a risk if there's money involved.";
				break;
			case 4:
				Background += "<br/>Flaw: I can't resist swindling people who are more powerful than me.";
				break;
			case 5:
				Background += "<br/>Flaw: I hate to admit it and will hate myself for it, but I'll run and preserve my own hide if the going gets tough.";
				break;
			}
			break;
		case "Criminal":
			Background += "<br/>Skills: Deception, Stealth<br/>Tool Proficiencies: One type of gaming set, thieves' tools<br/>Equipment: A crowbar, a set of dark common clothes including a hood, and a belt pouch containing 15 gp";
			Background += "<br/>Feature: Criminal Contact<br/>";
			trait = rand.nextInt(8);
			ideal = rand.nextInt(6);
			bond = rand.nextInt(6);
			flaw = rand.nextInt(6);
			int speciality =rand.nextInt(8);
			switch (speciality)
			{
			case 0: Background+="Speciality: Blackmailer";
			break;
			case 1: Background+="Speciality: Burglar";
			break;
			case 2: Background+="Speciality: Enforcer";
			break;
			case 3: Background+="Speciality: Fence";
			break;
			case 4: Background+="Speciality: Highway robber";
			break;
			case 5: Background+="Speciality: Hired killer";
			break;
			case 6: Background+="Speciality: Pickpocket";
			break;
			case 7: Background+="Speciality: Smuggler";
			break;
			}
			switch (trait)
			{
			case 0:
				Background += "<br/>Trait: I always have a plan for what to do when things go wrong.";
				break;
			case 1:
				Background += "<br/>Trait: I am always calm, no matter what the situation. I never raise my voice or let my emotions control me.";
				break;
			case 2:
				Background += "<br/>Trait: The first thing I do in a new place is note the locations of everything valuable - or where such things could be hidden.";
				break;
			case 3:
				Background += "<br/>Trait: I would rather make a new friend than a new enemy.";
				break;
			case 4:
				Background += "<br/>Trait: I am incredibly slow to trust. Those who seem the fairest often have the most to hide.";
				break;
			case 5:
				Background += "<br/>Trait: Never tell me the odds!";
				break;
			case 6:
				Background += "<br/>Trait: The best way to get me to do something is to tell me I can't do it.";
				break;
			case 7:
				Background += "<br/>Trait: I blow up at the slightest insult.";
				break;
			}
			switch (ideal)
			{
			case 0:
				Background += "<br/>Ideal: Honor. I don't steal from others in the trade.";
				break;
			case 1:
				Background += "<br/>Ideal: Freedom. Chains are meant to be broken, as are those who would forge them.";
				break;
			case 2:
				Background += "<br/>Ideal: Charity. I steal from the wealthy so that I can help people in need.";
				break;
			case 3:
				Background += "<br/>Ideal: Greed. I will do whatever it takes to become wealthy.";
				break;
			case 4:
				Background += "<br/>Ideal: People. I'm loyal to my friends, not to any ideals, and everyone else can take a trip down the Styx for all I care.";
				break;
			case 5:
				Background += "<br/>Ideal: Redemption. There's a spark of good in everyone.";
				break;
			}
			switch (bond)
			{
			case 0:
				Background += "<br/>Bond: I'm trying to pay off an old debt I owe to a generous benefactor.";
				break;
			case 1:
				Background += "<br/>Bond: My ill-gotten gains go to support my family.";
				break;
			case 2:
				Background += "<br/>Bond: Something important was taken from me, and I aim to steal it back.";
				break;
			case 3:
				Background += "<br/>Bond: I will become the greatest thief that ever lived.";
				break;
			case 4:
				Background += "<br/>Bond: I'm guilty of a terrible crime. I hope I can redeem myself for it.";
				break;
			case 5:
				Background += "<br/>Bond: Someone I loved died because of a mistake I made. That will never happen again.";
				break;
			}
			switch (flaw)
			{
			case 0:
				Background += "<br/>Flaw: When I see something valuable, I can't think about anything but how to steal it.";
				break;
			case 1:
				Background += "<br/>Flaw: When faced with a choice between money and my friends, I usually choose the money.";
				break;
			case 2:
				Background += "<br/>Flaw: If there's a plan, I'll forget it. If I don't forget it, I'll ignore it.";
				break;
			case 3:
				Background += "<br/>Flaw: I have a tell that reveals when I'm lying.";
				break;
			case 4:
				Background += "<br/>Flaw: I turn tail and run when things look bad.";
				break;
			case 5:
				Background += "<br/>Flaw: An innocent person is in prison for a crime that I committed. I'm okay with that.";
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