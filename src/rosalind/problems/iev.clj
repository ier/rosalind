(ns rosalind.problems.iev
  (:require
   [clojure.string :as str]))


(defn- iev
  [[a b c d e f]]
  (* (+ (* a 1)
        (* b 1)
        (* c 1)
        (* d 0.75)
        (* e 0.5)
        (* f 0))
     2))


(defn solve-iev [s]
  (->> (-> s
           (str/replace "\n" "")
           (str/split #" "))
       (map #(Integer/parseInt %))
       iev))


(solve-iev (slurp "resources/inputs/rosalind_iev.txt"))
