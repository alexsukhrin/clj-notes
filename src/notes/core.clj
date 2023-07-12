(ns notes.core
  (:use ring.adapter.jetty)
  (:gen-class))

(defn handler [_]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello World"})

(defn -main []
  (println "Start server")
  (run-jetty handler {:port 3000}))
