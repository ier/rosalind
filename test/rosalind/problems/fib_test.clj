(ns rosalind.problems.fib-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.fib :refer [solve-fib]]))


(deftest solve-dna-test
  (testing "solve-fib-sample-test"
    (let [sample (slurp "resources/inputs/rosalind_fib_sample.txt")
          expected 19]
      (is (= expected
             (solve-fib sample)))))

  #_(testing "solve-fib-test"
    (let [data (slurp "resources/inputs/rosalind_fib.txt")
          expected "..."]
      (is (= expected
             (solve-fib data))))))
