# internshipJava

java version "20.0.1" 2023-04-18
Java(TM) SE Runtime Environment (build 20.0.1+9-29)
Java HotSpot(TM) 64-Bit Server VM (build 20.0.1+9-29, mixed mode, sharing)
 
## File Structure Sample

### Key Terms: Code Building Blocks
1.  **Package**: Code folders. *Organizes classes.*
2.  **Interface**: Method contract. *Defines "what" classes do.*
3.  **Entity**: Data object. *Holds application information.*
4.  **Control**: Logic & actions. *Implements application rules.*
5.  **Boundary**: User interaction. *Handles input/output.*

```
src/main/java/              (Java code root - package names start here)
└── main/                   (Standard package folder)
    └── java/               (Standard package folder - folders=package names)
        ├── adt/            (Package: `main.java.adt` - **Data Structures**)
        │   └── ArrayList.java        (Your `ArrayList` - *how it works*)
        │   └── ListInterface.java    (List ADT Interface - *what a List does*)
        ├── applicantmanagement/ (Package: `main.java.applicantmanagement` - **Applicants**)
        │   └── Applicant.java        (Entity: `Applicant` data)
        │   └── ApplicantController.java (Control: `Applicant` logic)
        │   └── ApplicantUI.java      (Boundary: `Applicant` UI)
        ├── jobmanagement/     (Package: `main.java.jobmanagement` - **Jobs**)
        │   └── Job.java             (Entity: `Job` data)
        │   └── JobController.java   (Control: `Job` logic)
        │   └── JobUI.java         (Boundary: `Job` UI)
        ├── matchingengine/    (Package: `main.java.matchingengine` - **Matching**)
        │   └── MatchingService.java   (Control: Matching logic)
        ├── reporting/       (Package: `main.java.reporting` - **Reports**)
        │   └── ReportGenerator.java   (Control: Report logic)
        ├── scheduleinterview/ (Package: `main.java.scheduleinterview` - **Interviews**)
        │   └── InterviewScheduler.java (Control: Interview logic)
        ├── search/          (Package: `main.java.search` - **Search**)
        │   └── SearchService.java     (Control: Search logic)
        └── Main.java         (Program start point)
```
