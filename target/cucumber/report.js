$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "To demo cucumber",
  "description": "",
  "id": "to-demo-cucumber",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Open google and search text and verify seconds are displayed on top of the search result",
  "description": "",
  "id": "to-demo-cucumber;open-google-and-search-text-and-verify-seconds-are-displayed-on-top-of-the-search-result",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "searched anything",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "verify seconds displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStep.open_the_browser()"
});
formatter.result({
  "duration": 2144338608,
  "status": "passed"
});
formatter.match({
  "location": "TestStep.searched_anything()"
});
formatter.result({
  "duration": 1403454261,
  "status": "passed"
});
formatter.match({
  "location": "TestStep.verify_seconds_displayed()"
});
formatter.result({
  "duration": 37536451,
  "status": "passed"
});
});