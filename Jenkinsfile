
//Jenkinsfile for seed job

properties([
    pipelineTriggers([pollSCM('H/5 * * * *')])
])

 

node() {
    timestamps {
            ansiColor('xterm') {
                  checkout scm
          stage{  
              jobDsl ignoreExisting: true, 
                     additionalClasspath: 'utils', 
                     lookupStrategy: 'SEED_JOB',
                     targets: 'jobs/project1.groovy'
                }
                
          stage{  
              jobDsl ignoreExisting: true, 
                     additionalClasspath: 'utils', 
                     lookupStrategy: 'SEED_JOB',
                     targets: 'jobs/project2.groovy'
                }
            
          stage{  
              jobDsl ignoreExisting: true, 
                     additionalClasspath: 'utils', 
                     lookupStrategy: 'SEED_JOB',
                     targets: 'jobs/project3.groovy'
                }
        }
    }
}
