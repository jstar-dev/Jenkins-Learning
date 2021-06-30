import hudson.model.*
import hudson.task.*

hudsonInstance = hudson.model.Hudson.instance
allItems = hudsonInstance.allItems
buildableItems = allItems.findAll{ job -> job instanceof BuildableItemWithBuildWrappers }
String skipping="-DskipTest=false";

buildableItems.each { item ->        
    if(item.name.contains("-test-job")){   
      if(item.goals != null){
        println("test job are  : " + item.name); 
        println("Goals : " + item.goals+" "+ skipping );        

		item.goals = item.goals + " " + skipping ;    
        item.save();       
        println("Updated Goals : " + item.goals);
        println(" Updated the Job"); 
        
		 
       }    
    }
