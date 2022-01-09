(ns rosalind.problems.rna
  (:require
   [clojure.string :as str]))


(defn solve-rna [s]
  (-> s
      (str/replace "T" "U")
      (str/replace "\n" "")))


(->> "resources/inputs/rosalind_rna.txt"
     slurp
     solve-rna)
