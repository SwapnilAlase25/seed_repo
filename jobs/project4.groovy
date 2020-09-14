
pipelineJob('Project4') {

  def repo = 'https://github.com/SwapnilAlase25/project4.git'
  
  description("Project4_pipeline_job")

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
