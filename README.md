# internshipJava

java version "20.0.1" 2023-04-18
Java(TM) SE Runtime Environment (build 20.0.1+9-29)
Java HotSpot(TM) 64-Bit Server VM (build 20.0.1+9-29, mixed mode, sharing)
 
## File Structure
```
src/main/java/              (Source Root Directory - package names are relative to this)
└── main/                   (Part of the package name: `main`)
    └── java/               (Part of the package name: `java`)
        ├── adt/            (Package: `main.java.adt`)
        │   └── ArrayList.java        (package main.java.adt;)
        │   └── ListInterface.java    (package main.java.adt;)
        ├── applicantmanagement/ (Package: `main.java.applicantmanagement`)
        │   └── Applicant.java        (package main.java.applicantmanagement;)
        │   └── ApplicantController.java (package main.java.applicantmanagement;)
        │   └── ApplicantUI.java      (package main.java.applicantmanagement;)
        ├── jobmanagement/     (Package: `main.java.jobmanagement`)
        │   └── Job.java             (package main.java.jobmanagement;)
        │   └── JobController.java   (package main.java.jobmanagement;)
        │   └── JobUI.java         (package main.java.jobmanagement;)
        ├── matchingengine/    (Package: `main.java.matchingengine`)
        │   └── MatchingService.java   (package main.java.matchingengine;)
        ├── reporting/       (Package: `main.java.reporting`)
        │   └── ReportGenerator.java   (package main.java.reporting;)
        ├── scheduleinterview/ (Package: `main.java.scheduleinterview`)
        │   └── InterviewScheduler.java (package main.java.scheduleinterview;)
        ├── search/          (Package: `main.java.search`)
        │   └── SearchService.java     (package main.java.search;)
        └── Main.java         (Package: `main.java;` or no package if in `src/main/java`)
```