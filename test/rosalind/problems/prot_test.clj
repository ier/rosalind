(ns rosalind.problems.prot-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.prot :refer [solve-prot]]))


(deftest solve-iprb-test
  (testing "solve-iprb-sample-test"
    (let [sample (slurp "resources/inputs/rosalind_prot_sample.txt")
          expected "MAMAPRTEINSTRING"]
      (is (= expected
             (solve-prot sample)))))

  (testing "solve-prot-test"
    (let [data (slurp "resources/inputs/rosalind_prot.txt")
          expected "MDLMTSLVQRRKKYGKQAGFRDLRCHDSVTPVMLPINLFEQDLGRGGFCTSCRSGLLGYSADLIRNSARIGPDWHAQRFRDVYASAYSPVSGYTRLMRLPVTRWSSQKPLPNPVCRGTAICEYLSLAVWTHRPRTTWPLYRLSKGRGVAKPTSSLLWIIRSQPSERSYSMWKNRVGVCCPQAQPIDKSFRYVADVRVTISYFLTTGREMILRLMSYARKQDLHQLKQIGRIGQCMFSTAHGFRSRRWSNQADLDKHYVRLLLIGSPPRQMFCLPAAVVLAILCLRVSTHQRHRGCTVLRTQRIYAAQGRSQTSITHGHMLPRSIRLKAGKLRDYKIPCSFVCLYATRLVAVAERPLLIFLDMDLTRTWGEQLNCIFGNGQSYSCAIPTLSLTSDRVLPCKLVVTGSIWRSIIACSNPDNRFSQGPVMDPGSCASDQHLLFLGMRAGPLKLNFSFHSFPINPLPSFDAELNGQSSLGSDEHSSNRHYKSDPQYCMWTQIADSTVFNDTYGSKLSHREFRVMHLPKRRIPSGAYGVYETGAPNRTDTPVRMTNGVLRRAYVCYGNVLLGHAQTVNYLAPHWASHFSTSLIRAAPLPRYCPSLRNLVLFERLWATCLDNTPFVCVRNGPSWRNATIRNMGIRFGNPRDEHESAKRCSESSYLTLFTGLPKRSGRPPSGEDNGRTQFRTASSGRACSDPRDRSLFVLTSRKRRTKAKSSLMEPSHGDSSSGWISTGPFPSPFNGTSHLYSPVLLINVMAVFLWRVSTWIRPSLPARPTIDPFRPLEEWKYPLLRDLNRGIRGRIMLALRNTSDGRNPLFPLGFFFSAMKITIRRPIHLSAQARSSSTTPDETWRVRFGPSTRHRSTCYCLCCIVQDGLRQSGVTGLQSNYLFSLLDGIDETKDANSIISRSVFPVIVGHSHTGKRKGQLAGTSGKSSIISAQNPCTRSVATVGLGKCGNYVPREVFRRIGTDKARYRRRASTLHTQSGSSQCEHLISVWPFRFQTTLGRVINIVTAHSKVLSSVTLNHRKLRLDAALKENKPPSHDPWYVATGRVLGLIIQYGSLSLYALLPPFSETFLSGPTPSLIWSLAGVAGCRPPTRDLISLCRMNDLAIIVRKWRSATLATSLGCQPAIATILTLVWYTQKMPLFPIWYCNTLDVGPYVGACSSRRDAAYLFSRSHESNCSAVLFSTHNPFEILRACLGGVTLASSMTEHLTYLVDSTCALGSVSCGRQLVSLRGTTEGPQMLIRPPQAFCSSRGSSPGRRYSRGGLDNVYGVNFGTCCMVTVIKAWYSNKALSFSSNYLVTGFSNGPLGLRVTLATTHLEAPTENTCSVRRERLVQRPRNVAIINPYICTPYAWCLLPSIIVSCPITVQQARWDFSYIPYSIQTVFGACYSNHTRARPPHRCTSVAEISSILNTMARCRYSQQLTYTLDRGFPLRVECRDPVSINLPTPVSDTSTRHHRCIGSPLGGTIEKPCREFKQTRSPRDRIISDTHRKDSVGEGFIVPSYRLHVKLTLAVPWVVLVYAARLTVPGPTRTAIYIVSCGGGTMDAITQENIIKRSCDQRGLGVRHLVARRCGALHVQYSSFIVSRNIRWALHVHRGSLLIILAETELGVVFTRNYDPALTKDPPRLAQGYTLTGLKRYHRIFRRRLFQNRLSSCIDRTADNMLAYQDVLDFMRVLNTEPGRVGSAISESPTHWGPKHWVSYVVDPTRSWSIVETWKGQSCYDCSWRVSAGSIKFTAFLEPLYTLVMDMLILPSCTLIVYGCFTQCASCPSEVSSTPLPLGDRKSDQIRTSLERPYLSALSSSLVRGTLRKPRSTPSGGCLLHWHQSVNSVQSRPSEADSAYLPLSSGCLGRLAVRRPITDRLCLPFGAMYHTFDLHKLATHAKKSVLSRFASVVRSSSGCETWLRPHGVACGIHHVISKRAAMIIICTKSASYIRGSSTSTVGPKRDAYELRCYLYIYDRSRTIEVRRSDLQYVDYTDSLQPLPLSSRSRAFDTGIGPRMHTPVSPGTLRLWPTVLSEMLIRFSAYDLSGCQSDNRVQFGPGNIHCGESYLDTTAPRHPGAHGKQWNHAVLVLAFRVRSGRLFDNLVRFIEGAARLKRTTLRSKQHEYSDPDIFALTMAACAPNTSQILSSHRCMIGNLQAVRLRSCDLPHRTDQVVRITPSGVLDLSSSAGYNSFDPHIERVSLSWSPLWLKRCRPVRDQSEHCSRANCLVERSRTSGRGAIREFGYDGSTRKHFGAITSTCFGVVRYVYPLCPLWQRSYTESRTGDVNKSGRVPAGPVRHGTPSGLLLVRIVLGPILRLGFCFFSPFQVLACLPGVILIPLFAWLVNFMIRDNSIQEDPHFSNREKLLNQRTKTQSSCETHVSFGTIVGRRFRNDFISTTHLDGRCAASGRRLKQSCPSLGSHWRHDVLRREYLNAQMKCQPIIPETVSYRRCLNRDVAPSEVREVQGPNKQKRSFTPWEKHVAKETNRGRCDSVRICAVTIMAVRLVLGVRTTRVVVLFDLTRISIIAKTLRDIESARAGRHLHFIERSITIGRDDKPKQALRRAWDCRTYCVSSRTSCTTMVKFHRPPLGVVCLRWRPYTIAVFEILDISKFHLLRVIPSSYFNSPMNFLSLHGSLCTSIHEGRVCLWLNTSTLPRRIGESTLEEPIHPSFPSQDLPAVACEQL"]
      (is (= expected
             (solve-prot data))))))