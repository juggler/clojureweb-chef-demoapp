(ns wtf-main.cli-entrypoint
  (:gen-class)
  (:require [clojure.tools.cli :refer [cli]]
            [compojure.handler :refer [api]]
            [clojurewerkz.gizmo
             [core :refer [require-widgets require-snippets require-handlers
                           require-services register-snippet-reload]]
             [config :refer [load-config!]]
             [service :refer [start-all! all-services]]]))

(alter-var-root #'*out* (constantly *out*))

(defn -main
  [& args]
  (let [[options positional-args banner] (cli args
                                              ["--config" "Path to configuration file to use"])]
    (load-config! (:config options)))
  (require-snippets "wtf-main")
  (require-handlers "wtf-main")
  (require-widgets "wtf-main")
  (require-services "wtf-main")
  (register-snippet-reload "wtf-main")

  (start-all!))
