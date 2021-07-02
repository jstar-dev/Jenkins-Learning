package com.training.globalsharedlib
def call(String repo,String branch,String credentialsId) {
	// git "changelog: false, credentialsId: ${credentialsId}, poll: false, url: ${repo}, branch: ${branch}"
	 git changelog: false, credentialsId: 'github-credentials', poll: false, url: '${repo}', branch: 'master'
}
