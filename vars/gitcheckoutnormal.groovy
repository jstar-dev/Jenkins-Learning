def checkOutFrom(repo,credentialsId) {
  git changelog: false, credentialsId: $credentialsId, poll: false, url: $repo
}
