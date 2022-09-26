;; Fails: Imperative delayed async import
(ns main
  (:require [promesa.core :as p]))

;; It tries to load helper.mjs from '/src/helper.mjs'
;;                       instead of '/src/modules/module/helper.mjs'
(js/Promise. #(require '[modules.module.core]))

(println "Loaded main.cljs")
