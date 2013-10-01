(ns wtf-main.handlers.home)

(defn index
  [request]
  {:render :html
   :widgets {:main-content 'wtf-main.widgets.home/index-content}})
