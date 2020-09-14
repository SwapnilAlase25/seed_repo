pipelineJob('Project2') {

  def repo = 'https://github.com/SwapnilAlase25/project2.git'
  
  description("Project2_pipeline_job")

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
