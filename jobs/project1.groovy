
pipelineJob('Project1') {

  def repo = 'https://github.com/SwapnilAlase25/project1.git'
  
  description("Project1_pipeline_job")

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
