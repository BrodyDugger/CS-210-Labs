# Final Project

### Guidelines For Working in Repo
* Make branches and make pull requests (DO NOT COMMIT AND PUSH TO MAIN)
    
    * Branch: In terminal run these commands 

        1. git branch *InsertName* (creates branch)
        1. git switch *BRANCH* (switches to named branch)
        1. git branch (This just shows what branches are available and what branch is currently active)
    ---
    * Pull Requests: In terminal run these commands
        1. git add . (Stages changes to be committed)
        1. git commit -m "*InsertMessage*" (Creates a commit with a message, should summarize what's being added)
        1. git push origin BRANCH (Pushes branch to origin repo to make pull request)
        1. Go to Github repo and there should be a "Compare and Pull" button to make a pull request. can't miss it if it pops up 
            * If not go to pull requests tab to make it manually
    ---
    * Updating your main: In terminal run these commands
        1. git switch main (makes main active branch)
        1. git pull --ff-only upstream main (merges your main with pulled changes from everyone)
            * If upstream doesn't work do origin
        1. git push origin main (saves previous command)
    ---
* Everyone try and work on separate files to avoid conflicts
    * If there are conflicts we'll meet up and resolve it as a team

* Communicate with team frequently to avoid real life conflicts

* Try your best and ask for help if internet doesn't solve your issue