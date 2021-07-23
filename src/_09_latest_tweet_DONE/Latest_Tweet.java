package _09_latest_tweet_DONE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import twitter4j.*;
import twitter4j.auth.AccessToken;


public class Latest_Tweet implements ActionListener {
	String something;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField input = new JTextField(20);
	
	
	public void run() {
		frame.add(panel);
		panel.add(button);		
		panel.add(input);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	button.setText("search the twitterverse");
	button.addActionListener(this);
	frame.setTitle("The Okay Tweet Retriever");
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Tweet Tweet");
		something = input.getText();
	System.out.println(getLatestTweet(something));
	JOptionPane.showMessageDialog(null, getLatestTweet(something));
	
	}
	private String getLatestTweet(String searchingFor){

	    Twitter twitter = new TwitterFactory().getInstance();

	    AccessToken accessToken = new AccessToken(
	        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	    twitter.setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	    try {
	        QueryResult result = twitter.search(query);
	        return result.getTweets().get(0).getText();
	    } catch (Exception e) {
	        System.err.print(e.getMessage());
	        return "What the heck is that?";
	    }
	}

}
