def root="D://Training//Jenkins//jenkins_home"
def it = new File(root);
def threshold = 50
  
  percent = Math.ceil((it.getTotalSpace() - it.getFreeSpace()) * 100 / it.getTotalSpace())  
  println "Home Directory :" + it.getAbsolutePath()
  println "Total Size :" + Math.ceil(it.getTotalSpace() /1024/1024)
  println "Used space Size :" + Math.ceil((it.getTotalSpace() - it.getFreeSpace()) /1024/1024)
  println "Free space Size :" + Math.ceil(it.getFreeSpace() /1024/1024)
  println "Used Percentage :" + percent + "%"    
  
  if (percent >= Double.valueOf(threshold)){   
    println "Condition Jenkins Environment disk space exceeded threshold of :" +threshold+"%"
    return -1
  }else{
    return 0
  }
