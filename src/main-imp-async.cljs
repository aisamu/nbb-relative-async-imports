;; Works: Imperative delayed async import
(ns main
  (:require [promesa.core :as p]))

(p/do (require '[modules.module.core]))

(println "Loaded main.cljs")
