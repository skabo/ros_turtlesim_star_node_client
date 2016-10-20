
Android Client for turtlesim_star_node

You can build the application from Android Studio on windows or Linux because contains all the libraries for ROS and the ros android core is declared as a dependency. 
All other dependencies are integrated through ROS's maven repository on GitHub.

ROS automatically launches a MasterChooser activity to establish a connection to a running ROS instance. After the connection is stablished a second activity is launched with 2 buttons, one for start the drawing process and the other for pause it. 

Yo can import the project from Android Studio, build it, connect an android device to the host and run it. 
