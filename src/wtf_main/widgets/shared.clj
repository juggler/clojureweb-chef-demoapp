(ns wtf-main.widgets.shared
  (:require [clojurewerkz.gizmo.widget :refer [defwidget]]
            [wtf-main.snippets.shared :as shared]))

(defwidget header
  :view shared/header-snippet
  :fetch (fn [_]))
