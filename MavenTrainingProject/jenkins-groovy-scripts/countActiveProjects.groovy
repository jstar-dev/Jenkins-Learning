
println("existing job configurations: " + Jenkins.instance.items.size())
int i=0
for(item in Jenkins.instance.getItems()) {
  if (!(item instanceof org.jenkinsci.plugins.workflow.job.WorkflowJob)){
    if (!item.disabled){
      i++
    }
  } else {i++}
}
println("Number of active jobs: " + i)
