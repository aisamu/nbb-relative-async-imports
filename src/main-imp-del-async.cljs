;; Works: Imperative delayed async import
(ns main
  (:require [promesa.core :as p]))

(js/Promise. #(require '[modules.module.core]))

(println "Loaded main.cljs")
