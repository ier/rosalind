(ns rosalind.problems.dna)


(defn solve-dna
  [s]
  (->> ["A" "C" "G" "T"]
       (map #(re-seq (re-pattern %) s))
       (map count)
       (interpose " ")
       (apply str)))


(comment
  (->> "resources/inputs/rosalind_dna.txt"
       slurp
       solve-dna))
