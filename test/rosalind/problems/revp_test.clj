(ns rosalind.problems.revp-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.revp :refer [solve-revp]]))


(deftest solve-revp-test
  (testing "reverse-palindrom?"
    (is (#'rosalind.problems.revp/reverse-palindrom? "GATATC"))
    (is (#'rosalind.problems.revp/reverse-palindrom? "CTATAG"))
    (is (#'rosalind.problems.revp/reverse-palindrom? "TA"))
    (is (#'rosalind.problems.revp/reverse-palindrom? "TATA"))
    (is (#'rosalind.problems.revp/reverse-palindrom? "TATATA")))

  (testing "solve-revp-corner-cases-test"
    (is (= "1 4\n2 4\n3 4\n1 6"
           (solve-revp "TATATA")))

    (is (= "1 6\n1 12\n2 4\n2 10\n3 8\n4 6\n5 4\n7 6\n8 4"
           (solve-revp "TTTAAATTTAAA"))))

  (testing "solve-revp-sample-test"
    (is (= "4 6\n5 4\n6 6\n7 4\n17 4\n18 4\n20 6\n21 4"
           (->> "resources/inputs/rosalind_revp_sample.txt"
                slurp
                solve-revp))))

  
  #_
  (testing "solve-revp-test"
    (let [data (slurp "resources/inputs/rosalind_revp.txt")
          expected "..."
          actual (solve-revp data)]
      (is (= expected
             actual))
      actual)))
