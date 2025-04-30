# Guidelines For Working in Repo
* Make branches and make pull requests (DO NOT COMMIT AND PUSH TO MAIN)
* Everyone try and work on separate files to avoid conflicts
    * If there are conflicts we'll meet up and resolve it as a team

* Communicate with team frequently to avoid real life conflicts

* Try your best and ask for help if internet doesn't solve your issue

### Branch: In terminal run these commands 

        git branch *InsertName* (creates branch)
        git switch *BRANCH* (switches to named branch)
        git branch (This just shows what branches are available and what branch is currently active)
---
### Pull Requests: In terminal run these commands
        git add . (Stages changes to be committed)
        git commit -m "*InsertMessage*" (Creates a commit with a message, should summarize what's being added)
        git push origin BRANCH (Pushes branch to origin repo to make pull request)
        Go to Github repo and there should be a "Compare and Pull" button to make a pull request. can't miss it if it pops up 
             If not go to pull requests tab to make it manually
---
### Updating your main: In terminal run these commands
        git switch main (makes main active branch)
        git pull --ff-only upstream main (merges your main with pulled changes from everyone)
            If upstream doesn't work do origin
        git push origin main (saves previous command)
---
