(defproject ring/ring-spec "0.0.3"
  :description "Clojure specs for Ring"
  :url "https://github.com/ring-clojure/ring-spec"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [ring/ring-core "1.6.1"]]
  :profiles
  {:dev {:dependencies [[org.clojure/test.check "0.9.0"]]}})
