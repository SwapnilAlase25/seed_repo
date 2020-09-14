pipelineJob('Project3') {

  def repo = 'https://github.com/SwapnilAlase25/project3.git'
  
  description("Project3_pipeline_job")

  definition {
    cpsScm {
      scm {
        git {
          remote { url(repo) }
        }
      }
    }
  }
}
