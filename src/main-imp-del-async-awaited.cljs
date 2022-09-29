;; Half-works: Imperative promise-delayed async import awaited
(ns main
  (:require [promesa.core :as p]
            [nbb.core :refer [await]]))

(await (js/Promise. #(require '[modules.module.core])))

;; Never gets executed
(println "Loaded main.cljs")
(js/console.log "js: Loaded main.cljs")
