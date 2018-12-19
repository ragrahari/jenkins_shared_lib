@Library('shared-libraries') _

templatePipeline(repoUrl: 'https://github.com/ragrahari/jenkins_shared_lib.git', 
                 buildName: 'load-lib', imageStreamName: 'load-lib', deploymentName: 'load-lib')
