package com.training.globalsharedlib
def call(repo,branch,credentialsId) {
	git "changelog: false, credentialsId: ${credentialsId}, poll: false, url: ${repo}, branch: ${branch}"
}
