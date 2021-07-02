def call(repo,credentialsId) {
  git changelog: false, credentialsId: $credentialsId, poll: false, url: $repo, branch: $branch
}
