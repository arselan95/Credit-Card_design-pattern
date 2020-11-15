<h1>Determine Credit Card</h1><br>
<h2>Question 1</h2><br>
 <h3>Primary Problem</h3><br>
 <ul>
 <li>Figure out what type of card is the input card </li><br>
</ul>
 
 <h3>Secondary Problem</h3><br>
 <ul>
 <li>Create a relevant object of the input card based on the input values. </li><br>
</ul>
 
  <h3>Design Pattern</h3><br>
  <ul>
  <li>Factory Design Pattern</li><br>
 <li>Class Diagram</li> <br>
 <li>See question1a.pdf</li> <br>
	</ul>
 

 ![Screenshot](updatedquestion1a.png)


 <li>As per factory method:</li> <br>

![Screenshot](factory.png)


<ul>
<h4>How my classes relate with Factory Method</h4>

<ul>
<li>Product interface: Creditcard</li> <br>
<li>Concrete Product: Mastercard, Visa, Discover, Amex</li> <br>
<li>ConcreteCreater: Card</li> <br>
<li>Creator: Test</li><br>
</ul>
 </ul><br>
</ul><br>


<h3>Why</h3><br>
<ul>
<li>Creation of the Object is dependent on the input. </li><br>
<li>Create objects without exposing creational logic to clients. </li><br>
 <li>Client has a credit card but the factory needs to determine the type of that credit card and create that particular credit card as requested by the client.  </li></ul><br>
 
<h2>Question 2</h2><br>
<h3>Strategy Design Pattern</h3> <br>

![Screenshot](strategy.png)

<ul>
<li>Class Diagram of Input Parser</li> <br>
 <li>See question2a.pdf for zoomed file</li><br></ul>
	
	
![Screenshot](updatedquestion2a.png)


<ul>
<li>As per Strategy pattern:</li><br>
<ul>
	<h4>How my classes relate with Strategy Method</h4>
	<ul>
	<li>Context: InputFile</li><br>
	<li>Strategy: Parser</li><br>
	<li>ConcreteStrategy(s): MyJSONParser, CSVParser, XMLParser</li><br>
	<li>Test uses InputFile to see the change in behavior of InputFile when the parser needs to be changed as per input.</li>
	</ul><br>
</ul>
</ul>


<ul>
	<li>Class Diagram Output Parser</li><br>
	<li>See question2b.pdf for zoomed view</li><br>
</ul>


![Screenshot](updatedquestion2b.png)


<ul>
	<li>As per Strategy pattern:</li><br>
	<ul>
		<h4>How my classes relate with Strategy Method</h4>
	<ul>
		<li>Context: OutputFile</li><br>
		<li>Strategy: OutputParser</li><br>
		<li>ConcreteStrategy(s): MyJSONOutput, CSVOutput, XMLOutput</li><br>
		<li>Test uses OutputFile to see the change in behavior of OutputFile when the parser needs to be changed as per output to generate outputfile.</li>
		</ul><br>
    </ul>
</ul>


<h2>Overall class diagram</h2><br>
<ul>
<li>See question2c.pdf for zoomed view</li></ul><br>
	


![Screenshot](updatedquestion2c.png)


<h2>How To Run and Test</h2><br>
<ul>
<li>Build and Test java project</li><br>
<li>Main Driver file is : Test.java</li><br>
</ul>
<p><h2>OR </h2></p><br>
<ul>
	<li>Download the JAR file from https://github.com/gopinathsjsu/Arselan-IndividualProject-CreditCard/tree/main/Runnable%20JAR%20File</li><br>
	<li>Run command  `java -jar CreditCardApplication.jar *inputfilename* *outputfilename*`</li></ul><br>

![Screenshot](command.png) 
	
		
<h2>Sample screenshots of I/O</h2>


<p><h3>Run command `java -jar CreditCardApplication.jar testfiles/input/Sample.csv testfiles/output/outputcsvtojson.json`</h3></p>
	

![Screenshot](inputcsv1.png)

![Screenshot](csvtojsonoutput.png)

<br><br>



<p><h3>Run command`java -jar CreditCardApplication.jar testfiles/input/Sample.json testfiles/output/outputjsontoxml.xml`</h3></p>

![Screenshot](inputjson.png)

![Screenshot](jsontoxml.png)

<br><br>


<p><h3>Run command `java -jar CreditCardApplication.jar testfiles/input/Sample.xml testfiles/output/outputxmlttoxml.xml`</h3></p>

![Screenshot](inputxml.png)

![Screenshot](xmltoxml.png)

<br><br>

<p><h3>Run command `java -jar CreditCardApplication.jar testOutputFiles/input/Sample.json testOutputFiles/output/outputjsonttocsv.csv`</h3></p>

![Screenshot](inputjson.png)


![Screenshot](jsontocsvout.png)

<br><br>


<h2>JUnitTests</h2><br>


![Screenshot](Mastercardtest.png)

![Screenshot](VisaTest.png)

![Screenshot](amextest.png)

![Screenshot](discovertest.png)

![Screenshot](cardtest.png)

![Screenshot](myjsonparsertest.png)

![Screenshot](XMLparserTest.png)

![Screenshot](csvparsertest.png)

![Screenshot](inputfiletest.png)

![Screenshot](jsonoutputtest.png)

![Screenshot](csvoutputtest.png)

![Screenshot](XMLoutTest1.png)

![Screenshot](XMLOutTest2.png)

![Screenshot](outputfiletest.png)


