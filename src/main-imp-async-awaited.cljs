;; Works: Imperative do-delayed async import awaited
(ns main
  (:require [promesa.core :as p]
            [nbb.core :refer [await]]))

;; It tries to load helper.mjs from '/src/helper.mjs'
;;                       instead of '/src/modules/module/helper.mjs'
(await (p/do (require '[modules.module.core])))

(println "Loaded main.cljs")
