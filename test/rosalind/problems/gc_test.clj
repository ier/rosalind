(ns rosalind.problems.gc-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.gc :refer [solve-gc]]))


(deftest solve-gc-test
  (testing "solve-gc-sample-test"
    (let [sample (slurp "resources/inputs/rosalind_gc_sample.txt")
          expected "Rosalind_0808\n60.91954"]
      (is (= expected
             (solve-gc sample)))))

  #_(testing "solve-gc-test"
    (let [data (slurp "resources/inputs/rosalind_gc.txt")
          expected 1850229480761]
      (is (= expected
             (solve-fib data))))))
