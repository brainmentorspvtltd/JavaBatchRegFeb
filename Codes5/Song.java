import java.awt.image.ImagingOpException;

// Software - Procedural , OOPS
// OOPS - Class and Object
// OOPs Principals
// 1. Class and Object
// 2. Encapsulation - Data Members and Data Methods are Bind in Single Unit
// and that unit is called class
// 3. Data Abstraction (Data Hiding) - Making Variable as private
// What , Why and How 
// OOAD (Object Oriented Analysis and Design) - 
// S O L I D
// S - SRP (Single Responsiblity Principal)
// D - DRY (Don't Repeat YourSelf)
// Class Name - Noun


public class Song {
	// Characters
	// Data Security
	// private access is limit your members to access with in the class
	private int copyrightId;
	private int duration;  // Instance Member Variables of Class
	private String artistName;  // camelCase
	private String albumName;
	private String type;
	private String imagePath;
	private String appName;
	private boolean isQueue;
	private boolean isPlaying;
	private double price;
	private boolean isDownload;
	private String year;
	
	
	
	
	public int getCopyrightId() {
		return copyrightId;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getArtistName() {
		return artistName;
	}


	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}


	public String getAlbumName() {
		return albumName;
	}


	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	public String getAppName() {
		return appName;
	}


	public void setAppName(String appName) {
		this.appName = appName;
	}


	public boolean isQueue() {
		return isQueue;
	}


	public void setQueue(boolean isQueue) {
		this.isQueue = isQueue;
	}


	public boolean isPlaying() {
		return isPlaying;
	}


	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isDownload() {
		return isDownload;
	}


	public void setDownload(boolean isDownload) {
		this.isDownload = isDownload;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	private boolean isValidate(int duration){
		return duration>0 ? true:false;
	}
	
	
	// this is default constrcutor
	Song(){
		appName = "MTV Music App";
	}
	// this is param constructor
	// Constructor Overloading
	// Same name constructor but arguments are different
	Song(int duration , String albumName , String artistName , String type , String imagePath){
		// Constructor call must be on first line
		// here is constructor chaining
		this(); // Calling Default Constructor
		this.duration = duration;
		this.albumName = albumName;
		this.artistName = artistName;
		this.type = type;
		this.imagePath = appName +"/" +imagePath;
	}
	/*
	 * What is Constructor 
	 * Constructor name is same as class name
	 * Constructor is used to initalize the instance variables
	 * Constructor is called automatically whenever we create 
	 * the object
	 * there is default constructor present in every class
	 * by default
	 * the default constructor is empty by default 
	 * If u create any constructor in a class so 
	 * default constructor is kill automatically
	 * constructor never return, and no need to specify void
	 * if u specify void in constructor so it is treated as method
	 */
	
	// Data Always access through methods
	// arguments are local  method (verb)
//	public void takeSong(int duration  , String artistName , String albumName, String type , String imagePath){
//		if(isValidate(duration)){
//		this.duration = duration;
//		// assignment (Instance Variable = Local Variable)
//		this.artistName = artistName;
//		this.albumName = albumName;
//		this.type = type;
//		this.imagePath = imagePath;
//		}
//		else{
//			System.out.println("Invalid Duration Can't Take the Data...");
//		}
//		}
	
	public void printSong(){
		// e.g boomboom.printSong()  e.g 99.printSong() 99 is reference
		// when ever any object is calling the printSong() method
		// so the object reference is copied into printSong() method
		// now reference is hold by special keyword called this
		// this hold the current reference
		System.out.println("**************************");
		System.out.println("Duration is :: "+this.duration);
		System.out.println("Artist Name is :: "+artistName);
		System.out.println("Album Name is :: "+albumName);
		System.out.println("Album Type is :: "+type);
		System.out.println("Image Path is :: "+imagePath);
		System.out.println("App Name "+appName);
		System.out.println("**************************");
	}

}
