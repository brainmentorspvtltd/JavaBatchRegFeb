
public class TestSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Code Repeat 
		// Local 
		Song boomboom = new Song(10, "Party", "My XX", "HardCore", "images/Abc.jpg");
		//boomboom.takeSong(10, "Mr X", "Party", "HardCore", "images/Abc.jpg");
		boomboom.setDuration(11);
		System.out.println(boomboom.getDuration());
		//boomboom.printSong();
//		boomboom.albumName="BOOM ";
//		boomboom.artistName="Mr X";
//		boomboom.duration =-20;
//		System.out.println(boomboom.albumName);
//		System.out.println(boomboom.artistName);
//		System.out.println(boomboom.duration);
		Song bangbang = new Song(7, "Z" , "Mr X ","Party Song","images/party.jpg");
		//bangbang.isValidate(-7);
		//bangbang.takeSong(-7, "Mr Y", "Z", "Sad Songs", "images/sad.jpg");
		bangbang.printSong();
//		bangbang.albumName="Bang";
//		bangbang.artistName="Mr Y";
//		System.out.println("***************************");
//		System.out.println(bangbang.albumName);
//		System.out.println(bangbang.artistName);

	}

}
