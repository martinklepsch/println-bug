(ns println-bug.app)

(enable-console-print!)

(defn init []
  (println "test")
  (let [c (.. js/document (createElement "DIV"))]
    (aset c "innerHTML" "<p>i'm dynamically created</p>")
    (.. js/document (getElementById "container") (appendChild c))))
