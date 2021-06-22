package com.training.globalsharedlib
def call(repo,credentialsId) {
	git "changelog: false, credentialsId: ${credentialsId}, poll: false, url: ${repo}"
}
