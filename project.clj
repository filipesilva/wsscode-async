(defproject com.wsscode/async "1.0.11"
  :description "Helpers for Clojure core.async."
  :url "https://github.com/wilkerlucio/wsscode-async"
  :license {:name "MIT"
            :url  "https://opensource.org/licenses/MIT"}

  :source-paths ["src"]

  :dependencies [[org.clojure/core.async "1.1.587"]]

  :jar-exclusions [#"node-modules/.+"]

  :deploy-repositories [["clojars" {:url   "https://clojars.org/repo/"
                                    :creds :gpg :checksum :ignore}]
                        ["releases" :clojars]
                        ["snapshots" :clojars]])
