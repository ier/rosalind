(ns rosalind.problems.revp-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.revp :refer [solve-revp]]))


(deftest solve-revp-test
  (testing "reverse-palindrom?"
    (is (#'rosalind.problems.revp/reverse-palindrom? "GATATC"))
    (is (#'rosalind.problems.revp/reverse-palindrom? "CTATAG")))

  (testing "solve-revp-sample-test"
    (let [sample (slurp "resources/inputs/rosalind_revp_sample.txt")
          expected "4 6\n5 4\n6 6\n7 4\n17 4\n18 4\n20 6\n21 4"
          actual (solve-revp sample)]
      (is (= expected
             actual))))

  #_
  (testing "solve-revp-test"
    (let [data (slurp "resources/inputs/rosalind_revp.txt")
          expected "..."
          actual (solve-revp data)]
      (is (= expected
             actual)))))
