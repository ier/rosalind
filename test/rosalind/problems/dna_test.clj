(ns rosalind.problems.dna-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.dna :refer [solve-dna]]))


(deftest solve-dna-test
  (testing "solve-dna-sample-test"
    (let [sample (slurp "resources/inputs/rosalind_dna_sample.txt")
          expected "20 12 17 21"]
      (is (= expected
             (solve-dna sample)))))
  
  (testing "solve-dna-test"
    (let [data (slurp "resources/inputs/rosalind_dna.txt")
          expected "228 229 206 241"]
      (is (= expected
             (solve-dna data))))))
