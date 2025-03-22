
import java.util.HashSet;

import java.util.Scanner;
public class DiscordStackList
{
	public static void main(String[] args)
	{
	
	Scanner scanner = new Scanner(System.in);
	
	//Asks the user to enter the number of people that have attended the Hackathon in Person
	System.out.println("Enter how many people have attended the Hackathon: ");
	int numOfPeople = scanner.nextInt();
	scanner.nextLine();
	
	System.out.println("The number of people that attended the Hackathon is: "+ numOfPeople);
	
	
	//usernames in the Hackathon Discord Channel
	String[] usernames = {  "Abi", "aj", "Amazing98", "ananya", "Andrew", "baam", "brodie", "cbg.lex03", "Charthaguy", "chris",
   	    "cuzcano", "danski", "Elgniston", "funny", "Gee1_AndOnly", "ghostflame", "Izzyii", "IloveOrange", "Jake",
   	    "Kayy *.°", "love yourselves <3", "Kyle", "Mariah Weatherspoon", "maryam", "MAX", "mike", "Moblie Pro",
   	    "Mr. White(elhowarm@kean.edu)", "mupoyyyy", "00", "Neo", "organ", "Ploebe", "lock in time", "Ramamurthy Sundar",
   	    "rodgon96", "S.", "San Miguel", "", "The Fuzzy Sheep", "Trupera", "unusually_calm", "Willy G",
   	    "3abkader", "A Person ヅ+", "A.o is tired", "aayushchitransh", "Aditya", "adriana altamirano | USA", "AGhost.in",
   	    "Alessandro", "Alexis", "aluna107", "Amazing98", "Amin", "Anu", "Asmit Patidar", "Aura", "AwesomeNJL",
   	    "Ben Kellum", "Blackhead", "BRAGO475", "Brandon Mirabal", "Captn_Killah", "cdubbx", "Chronyc.", "Cipher",
   	    "youseff", "skdada98", "SkyVittal", "SparklingRain", "Sr.Scuba", "TheBravestClown", "Trillz From State Farm",
   	    "UnfunnyComedian", "Valentina", "WilbertFV", "xena khan", "Yanwu Xu", "YOU-NESS", "Patrick Aaron", "Phil",
   	    "이 Ploebe", "Prince973", "Proper", "SATANMYNINJAS", "sebas555", "seb™™", "shadowolf430", "shiva prakash perumal",
   	    "Sidi", "sinatra", "Maria", "M mhmm", "Moksh", "Mr.Necro", "MrJug", "nour3", "Nabil Belfki", "Natalie", "NAZIB",
   	    "Noah Mea", "notevenknowing", "Justin", "Justin", "kai", "Karl", "Katakuri420", "Kay", "Khushi Talaviya",
   	    "kingdomkiller432", "ko", "KoldKoala", "Landy", "liv", "Gloria", "Hall_of_misi", "havok.l_l", "immortal",
   	    "Issajay", "J", "JAM", "Joey Lagoons", "Jolene", "Jon", "jrthesneakergod", "Junlin gou", "CrazedLemonade",
   	    "dahana", "dalia", "Danny g", "David Arosemena", "Dev", "Dexter Ity", "Diana_M", "drizzyallen", "Eva Velez", "Frances"
};
	
	//usernames in the ACM Discord channel
	String[] ACMusernames = {"tarantula", "thecharles163", "이", "Tim", "Vortex", "WilbertFV", "wyd.frank", "yuck", "Zach Gordon",
           "Saharasarah", "Sampson U", "SATANMYNINJAS", "Sebastian", "Sebby", "shadowolf430", "KALI",
           "Shayla", "Sherwin", "skyler", "ssgssnelson", "Stephany G.", "subbybrat420", "Neo", "nickyxe.", "onlyleslo",
           "pedrinsc", "poiofrito.-.XD", "Prince973", "pulsemike", "Rafa2908", "Rafael", "Raine",
           "ray_ray", "Landy", "Maiyel", "Maria", "Mariah Weatherspoon", "maryam", "Meera", "MegidoArk",
           "Mmhmm", "Miguel Angel Soler", "monika", "Mr.Necro", "Mysara", "Jara", "JeSyah Williams", "jo", "june",
           "Justforfunn", "KARAN", "Karl", "Kimberly", "ko", "KoldKoala", "kor_av4311", "gbe_moh", "Gil Roberts", "gissell♡",
           "Glo", "Hall_of_misi", "ily Josh", "immortal", "J", "j-bug76", "Jara", "JeSyah Williams", "jo", "Caleb",
           "Christopher", "dahana", "damedolla190", "Darwin", "David aka Supermarket", "DavidArosemena",
           "Dezzy", "Dom Rives", "Emmanuel", "english major (derogatory)", "AdrianB", "X", "alphachris.",
           "am 4523", "Amazing98", "Anthony", "asia", "Avocadodoooo", "Aythatskev", "BigBoyChese", "Brandon Mirabal",
           "Braulio (B)", "Brianna Rivera", "Neo", "Ormmingeek", "oscar", "Redツ", "Ricky_Urbaez", "saturn1359", "Willy G",
           "銀華", "OnyxT7Jester", "Abi", "Aditya", "Drew", "funny", "Gee1_AndOnly", "ghostflame",
           "Joel Leiva", "Jolene", "Jordan", "Kalamxri", "Maliha Haider", "MAX", "Mr. White(elhowarm@kean.edu)",
           "Luis", "aj", "ann!", "baam", "Basil M", "cbg.lex03", "Chance", "egg", "cuzcano", "cvallas", "Danny",
           "Dead_Wind", "Ryan", "iizzyii"};
	
	int count = 0;
	HashSet<String> set1 = new HashSet<>();
	HashSet<String> set2 = new HashSet<>();
	HashSet<String> inCommon = new HashSet<>();
	
	for(String name : usernames)
	{
		set1.add(name);
	}
	
	for (String name : usernames) {
       if (set1.contains(name)) {
           count++;
       }
   }
	System.out.println("Number of people in the Hackathon Discord: " + count);
	
	int ACMcount = 0;
	for(String name2 : ACMusernames)
	{
		set2.add(name2);
	}
	
	for (String name : ACMusernames) {
       if (set2.contains(name)) {
           ACMcount++;
       }
   }
	System.out.println("Number of people in the ACM Discord: " + ACMcount);
   int diff = count - numOfPeople;
   System.out.println("Number of people attended the Hackathon but not in Hackathon Discord: "+ diff);
	
	 HashSet<String> hackathonSet = new HashSet<>();
    HashSet<String> acmSet = new HashSet<>();
    for (String name : usernames) {
        hackathonSet.add(name);
    }
    for (String name : ACMusernames) {
        acmSet.add(name);
    }
   
	 // Ask user for a name to search
   System.out.println("Enter a username to search: ");
   String searchName = scanner.nextLine().trim();
   boolean inHackathon = hackathonSet.contains(searchName);
   boolean inACM = acmSet.contains(searchName);
   // Display results
   if (inHackathon && inACM) {
       System.out.println(searchName + " is in BOTH the Hackathon and ACM Discord.");
   } else if (inHackathon) {
       System.out.println(searchName + " is ONLY in the Hackathon Discord.");
   } else if (inACM) {
       System.out.println(searchName + " is ONLY in the ACM Discord.");
   } else {
       System.out.println(searchName + " is NOT in either Discord.");
   }
	
	for(String name : ACMusernames)
	{
		if (set1.contains(name)) {
			inCommon.add(name);
		}
	}
	
	System.out.println("Names that appear in Both Discords: ");
	for (String name : inCommon)
	{
		System.out.print(name+ " , ");
	}
	
	}
	
}


