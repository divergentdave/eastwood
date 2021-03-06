(defproject kria "0.1.16-SNAPSHOT"
  :description "A Clojure client library for Riak 2.0.0. Uses Java 7 NIO.2."
  :url "https://github.com/bluemont/kria"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.google.protobuf/protobuf-java "2.6.0"]
                 [com.basho.riak.protobuf/riak-pb "2.0.0.16"]]
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :javac-options ["-target" "1.7" "-source" "1.7"]
  :profiles {:dev
             {:source-paths ["dev"]
              :dependencies [[org.clojure/tools.namespace "0.2.5"]
                             [org.clojure/data.json "0.2.5"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0-master-SNAPSHOT"]]}
             })
