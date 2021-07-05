package oops.Interfaces;

//public class YouTuber {

interface YouTuber {
// If we want to instantiate the method in an interface then we have to use the keyword "default". There's no any compulsion of 
// Overriding the function.
	default void Editing () {
		System.out.println("I prefer editing my videos using Movavi Video Editor.");
	}
	void Channel (String ChannelName, String field);
}
