import hudson.model.*

folderToBeReloaded = "parallel-stage"
itemObj = null
folders = Jenkins.instance.getAllItems(com.cloudbees.hudson.plugins.folder.Folder)
folders.each { j ->
  if (j.fullName == folderToBeReloaded){
    itemObj = j
      }  
}

if(itemObj == null){
  println("Folder " + folderToBeReloaded + " not found! Exiting...")
  return; //exit if folder is not found
};

findAllItems(((com.cloudbees.hudson.plugins.folder.Folder) itemObj).getItems())

def findAllItems(items){  
for(item in items)
{
    if (!(item instanceof com.cloudbees.hudson.plugins.folder.Folder)) {
      if(item instanceof AbstractProject) {
        item.doReload(); //reload job
        println(item.name + " reloaded");
      }
    } else {
        findAllItems(((com.cloudbees.hudson.plugins.folder.Folder) item).getItems())
        //Drill into folders
     }
}
}
