default_run_options[:pty] = true
set :ssh_options, { :forward_agent => true }

set :application, "app-name"
set :repository,  "git@github.com:username/path.git"

set :scm, :git
set :branch, "master"

role :web, "ip"
role :app, "ip"

set :user, "deployer"
set :use_sudo, false

set :deploy_via, :remote_cache
set :deploy_to, "/home/deployer/app-name"

set :keep_releases, 3
after "deploy:restart", "deploy:cleanup"

namespace :deploy do
  desc "Start the lein server"
  task :start do
    run "cd #{current_path}; lein daemon start server --config config/production.clj"
  end

  desc "Restart daemon"
  task :restart do
    data = capture "cd #{current_path}; lein daemon check server"
    if data =~ /server is running/
      stop
      sleep 1
      start
    end
  end

  desc "Stop the lein server"
  task :stop do
    run "cd #{current_path}; lein daemon stop server --config config/production.clj"
  end

  desc "Check if daemon is running"
  task :check do
    run "cd #{current_path}; lein daemon check server"
  end

end
