clojureweb-chef-demoapp
=======================

demo app for [clojureweb-chef](https://github.com/juggler/clojureweb-chef#continue-with-capistrano)

# Quick start

* prepare server with [clojureweb-chef](https://github.com/juggler/clojureweb-chef#continue-with-capistrano)
* edit [config/deploy.rb](https://github.com/juggler/clojureweb-chef-demoapp/tree/master/config/deploy.rb)
* `cap deploy:setup`
* `cap deploy`

# lein-daemon

This app contains `lein-daemon` plugin for for daemonizing a server process. Read more [here](https://github.com/juggler/lein-daemon).
