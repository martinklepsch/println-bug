(ns println-bug.app)

(enable-console-print!)

(println "outside init")

(defn init []
  (println "inside init")
  (let [c (.. js/document (createElement "DIV"))]
    (aset c "innerHTML" "<p>i'm dynamically created</p>")
    (.. js/document (getElementById "container") (appendChild c))))
