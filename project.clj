(defproject wtf-main "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clojurewerkz/gizmo "1.0.0-alpha2"]
                 [org.clojure/tools.nrepl "0.2.3"]
                 [org.clojure/tools.cli "0.2.2"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.4"]]}}
  :source-paths ["src"]
  :plugins [[lein-daemon "0.5.4"]]
  :daemon {"server" {:ns wtf-main.cli-entrypoint
                    :pidfile "/home/deployer/app-name/shared/pids/server.pid"}}
  :resource-paths ["resources"]
  :main wtf-main.cli-entrypoint)
