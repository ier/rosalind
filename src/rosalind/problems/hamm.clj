(ns rosalind.problems.hamm
  (:require
   [clojure.string :as str]))


(defn- hamm
  [[s1 s2]]
  (let [len (count s1)
        fnx (fn [s c] (subs s c (inc c)))]
    (->> (map
          #(= (fnx s1 %) (fnx s2 %))
          (range len))
         (filter false?)
         count)))


(defn solve-hamm [s]
  (-> s
      (str/split #"\n")
      hamm))


(solve-hamm (slurp "resources/inputs/rosalind_hamm.txt"))
