(ns wtf-main.widgets.home
    (:require [clojurewerkz.gizmo.widget :refer [defwidget]]
              [wtf-main.snippets.home :as snippets]))

(defwidget index-content
  :view snippets/index-snippet
  :fetch (fn [_]))
