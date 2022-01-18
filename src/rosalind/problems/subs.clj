(ns rosalind.problems.subs
  (:require
   [clojure.string :as str]))


(defn- sbs
  [[s t]]
  (loop [dbg-cntr 0 idx 0 acc []]
    (let [pos (str/index-of s t idx)]
      (if (nil? pos)
        (apply str (interpose " " acc))
        (recur (inc dbg-cntr) (inc pos) (conj acc (inc pos)))))))


(defn solve-subs [s]
  (-> s
      (str/split #"\n")
      sbs))


(solve-subs (slurp "resources/inputs/rosalind_subs.txt"))
