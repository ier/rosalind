(ns rosalind.problems.iev
  (:require
   [clojure.string :as str]))


(defn- iev
  [s]
  s)


(defn solve-iev [s]
  (-> s
       (str/replace "\n" "")
       (str/split #" ")
       iev))


(solve-iev (slurp "resources/inputs/rosalind_iev_sample.txt"))
