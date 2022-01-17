(ns rosalind.problems.gc-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.gc :refer [solve-gc]]))


(deftest solve-gc-test
  (testing "solve-gc-sample-test"
    (let [sample (slurp "resources/inputs/rosalind_gc_sample.txt")
          expected "Rosalind_0808 60.91954%"]
      (is (= expected
             (solve-gc sample)))))

  (is (= (float 52.286774)
         (#'rosalind.problems.gc/gc
          {:title "Rosalind_6428"
           :content "TTGCTTTGTCCGCCCTTCCGATGCCCTAAAGCGAGAACCACCGGACCGTCCGCAATGTACTCATACGCGTCCGTGCTCCTATTTTGCGGCAGCGTTAGAGTGATCCTCTCGCTTCTACAAATGTGGATTCACGCCAGCCCTAGCTTCAGCTAGCCGACCTCGTCGAAATTTTTGATCTCACTATCGGATCTTGAGTTACCTATCAGAGCGCAATCCGTCAATGAGACGTCGTCAGGTAATCATCACACGAAGCTACTTTTAAATGCATTACAAGAGAGGGAGTATGATGTTTTTCAGGCTTGCTAATCTACCTCTGCCGGAGAACTGGCCCCCAGATCCATGCCACCACATACCCGAGGAGGACTCGACCGTACTAGCTTTAACTCCAGCACCTTCTTTGTGGGACGGCGCTGACTAGAAACGGCGGTACGTTGCTAGACAAATCCCGCCGAATTATCACCAATCGTTGCCGATGCGCGAAGGCGCATTGCATATGGCCTGGCGGTCACAATAGCAACCTGCTTGGTACGGACAGCCATCGCAACTATCCCGTGGCGCGAGAACCCAACTTGACAATTCCTGGACGTTTTTTCCAAAGGCAGTGCGACTATACGAGTGCAACAACTGTCGATAGTGACGACGTCGGGCATAGCAGTAGGATTCCCACATGCACAGCATGTGCTGCGGGCAACTCATCAGACAAACTCATTAAAGCCTGACAGGCGATGTTATCGGAAATTACGCTCCATACAGCCTTGGGCACGTTATCCGGCCGCACGCAAGGCGAAGAACGGGGGATAGGTTATGCG"})))

  (testing "solve-gc-test"
      (let [data (slurp "resources/inputs/rosalind_gc.txt")
            expected "Rosalind_4440 52.05205%"]
        (is (= expected
               (solve-gc data))))))
