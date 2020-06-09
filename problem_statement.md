Problem Statement:
 
We know that radio is a very useful device. A radio should have the following capabilities:

1.	Turn the power on/off
2.	Channel Up
3.	Channel Down
4.	Volume Up
5.	Volume Down
 
In order to provide these capabilities, radio must retain some information with it, for example current state (on or off), current volume level, current channel.  When we have a radio and turning it ON will have its initial values of these state variables. This is the job of your class constructor.

You will need to have an object that simulates the radio, and a main program to actually drive the radio. This should simply be a loop that will allow the user to type in requests.
You need to give a menu that the user can choose from. It should look something like the following:

Press:
  P...to press the power button
  U...to press the channelUp button
  D...to press the channelDown button
  +...to press the volumeDown button
  -...to press the volumeUp button
  Q...to exit simulation
Also, you need to show the state of the radio after every time the user does something.
      Current State:  Channel: 630 AM  Volume: 11  Power: ON

