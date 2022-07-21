Feature: US001
  Scenario:Gecerli bir SSN, 3. ve 5. rakamdan sonra "-" icermeli ve 9 rakamdan olusmalidir.
    Given medunna ana sayfasina gider
    And  ana sayfa giris ikonuna tiklar
    And  Register butonuna tiklar
    And  SSN kutusuna uygun ssn girer
    Then hata mesajinin cikmadigini test eder
    And  tarayiciyi kapatir

