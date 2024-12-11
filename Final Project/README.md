#GameSelectorApp

##Synopsis

The game selector app is a JavaFX app meant to have a user enter the name of different video-games and their genre into the app and have the app pick a game at 
random from the list that they've created using the app to make a decision on what to play.

##Motivation

I build this app as my final project for my course TESD 1800 Software Development. I needed to make a project that would be simple enough to make with the time constraint
that I had and be something that I'm interested in. I'm an avid gamer and have a large list of unplayed games on multiple platform. I thought that this app could help me
make a list of games and help me with my choice paralysis so that I can pick a game faster on my days off and start enjoying them, as I have found myself staring at game
libraries for hours in the past not able to just pick something to start.

##How to Use

To run the app, just you use any Java compiler. While running, it will show a simple to use box with two text entry label, write your game title in those as well
as the genre. Use the "add game" button to add the game you've entered. Once you are done building a list, click on the "Pick a random game" button. A pop up should
show up telling you what to play next.


##Code Example

Here is a small snippet of part of the code that I'm particularly proud of:
  ```
  Alert alert = new Alert(Alert.AlertType.INFORMATION);
	alert.setTitle("Random Game Selected");
	alert.setHeaderText(null);
	alert.setContentText("Selected game: " + randomGame);
	alert.showAndWait();
  ```
I cannot remember this bit being covered in my book and had to figure out how to make a pop up and make it work with the code that I had already written for my app.
