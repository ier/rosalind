(ns rosalind.core
  (:require
   [clojure.string :refer [split trim-newline]]))


(defn cut [s]
  (let [v (-> s
              trim-newline
              (split #">"))]
    (filter seq v)))


(defn parse [s]
  (let [[a & rest] (split s #"\n")]
    {:title a
     :content (apply str rest)}))
