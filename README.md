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
src/main/java/              (Java Code Root - Packages start here)
├── main/                   (Standard Package Folder)
│   └── java/               (Standard Folder - Folders=Package Names)

│       ├── adt/                 (Package: `main.java.adt` -  [Abstract Data Types])
│       │   ├── ArrayList.java           (Your ArrayList -  <Implementation Details>)
│       │   └── ListInterface.java       (List ADT Interface -  <Functionality Definition>)

│       ├── applicantmanagement/ (Package: `main.java.applicantmanagement` -  [Applicant Module])
│       │   ├── Applicant.java           (Entity: `Applicant` Data)
│       │   ├── ApplicantController.java (Control: `Applicant` Logic)
│       │   └── ApplicantUI.java         (Boundary: `Applicant` UI)

│       ├── jobmanagement/       (Package: `main.java.jobmanagement` -  [Job Module])
│       │   ├── Job.java                 (Entity: `Job` Data)
│       │   ├── JobController.java       (Control: `Job` Logic)
│       │   └── JobUI.java               (Boundary: `Job` UI)

│       ├── matchingengine/      (Package: `main.java.matchingengine` -  [Matching Module])
│       │   └── MatchingService.java     (Control: Matching Logic)

│       ├── reporting/           (Package: `main.java.reporting` -  [Reporting Module])
│       │   └── ReportGenerator.java     (Control: Report Logic)

│       ├── scheduleinterview/   (Package: `main.java.scheduleinterview` -  [Scheduling Module])
│       │   └── InterviewScheduler.java  (Control: Interview Logic)

│       ├── search/              (Package: `main.java.search` -  [Search Module])
│       │   └── SearchService.java       (Control: Search Logic)

│       └── Main.java            (Program Start Point)
```
