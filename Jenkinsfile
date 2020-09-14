
//Jenkinsfile for seed job

properties([
    pipelineTriggers([pollSCM('H/5 * * * *')])
])

 

node() {
    timestamps {
            ansiColor('xterm') {
                  checkout scm
                
          stage('Project1'){  
              jobDsl ignoreExisting: true, 
                     additionalClasspath: 'utils', 
                     lookupStrategy: 'SEED_JOB',
                     targets: 'jobs/project1.groovy'
                }
               
          stage('Project2'){  
              jobDsl ignoreExisting: true, 
                     additionalClasspath: 'utils', 
                     lookupStrategy: 'SEED_JOB',
                     targets: 'jobs/project2.groovy'
                }
            
          stage('Project3'){  
              jobDsl ignoreExisting: true, 
                     additionalClasspath: 'utils', 
                     lookupStrategy: 'SEED_JOB',
                     targets: 'jobs/project3.groovy'
                }
                
          stage('Project4'){  
              jobDsl ignoreExisting: true, 
                     additionalClasspath: 'utils', 
                     lookupStrategy: 'SEED_JOB',
                     targets: 'jobs/project4.groovy'
                }
        }
    }
}
