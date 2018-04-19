$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BrowserStack.feature");
formatter.feature({
  "line": 1,
  "name": "Test using browser stack",
  "description": "",
  "id": "test-using-browser-stack",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5556033267,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Search something in Google",
  "description": "",
  "id": "test-using-browser-stack;search-something-in-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "try to open google in browser stack",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i search some",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i should get respone",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.try_to_open_google_in_browser_stack()"
});
formatter.result({
  "duration": 1878609536,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.i_search_some()"
});
formatter.result({
  "duration": 426525028,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.i_should_get_respone()"
});
formatter.result({
  "duration": 1469902383,
  "status": "passed"
});
});