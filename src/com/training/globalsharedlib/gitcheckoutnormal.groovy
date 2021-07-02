package com.training.globalsharedlib
def call(repo,branch,credentialsId) {
	// git "changelog: false, credentialsId: ${credentialsId}, poll: false, url: ${repo}, branch: ${branch}"
	 git changelog: false, credentialsId: 'github-credentials', poll: false, url: ${url}, branch: 'master'
}
