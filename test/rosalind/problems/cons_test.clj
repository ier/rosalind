(ns rosalind.problems.cons-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.cons :refer [solve-cons]]))


(deftest solve-cons-test
  (testing "solve-cons-sample-test"
    (let [sample (slurp "resources/inputs/rosalind_cons_sample.txt")
          expected "ATGCAACT\nA: 5 1 0 0 5 5 0 0\nC: 0 0 1 4 2 0 6 1\nG: 1 1 6 3 0 1 0 0\nT: 1 5 0 0 0 1 1 6"
          actual (solve-cons sample)]
      (is (= expected
             actual))))
`  
  (testing "most-frequent function"
    (let [input '("C" "C" "G" "C" "G" "C" "G")
          expected "C"
          actual (#'rosalind.problems.cons/most-frequent input)]
      (is (= expected
             actual))))

  #_(testing "solve-cons-test"
    (let [data (slurp "resources/inputs/rosalind_cons.txt")
          expected "..."]
      (is (= expected
             (solve-cons data))))))
