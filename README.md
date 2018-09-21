****Practical SQA****

*HOW TO PUSH YOUR CHANGES TO GIT HUB*

1. Being on `master` branch, make sure you don't have uncommitted changes:
    run `git status` command. If any, they'll appear in red.

2. Cut your own branch from `master`, typing:
    `git checkout -b name_of_your_branch`

3. Type `git branch` to verify that you created the branch
    (your currently branch will appear in green)

4. To set the remote as upstream, use `git push --set-upstream origin test` command

5. After you did some changes, add them ALL to staging by typing `git add .`

6. To add some of the changes, instead `git add .` you can assign path to the file
    you want to commit after adding
    Example: `git add /Users/sofia/IdeaProjects/AssessmentControl/src/test/resources/features/1.ObjectsPropertiesMethods/firstTest.feature`

7. Type `git status` to check that you added all the changes
    (they will be shown in green)

8. To add your changes from stage to your branch, type `git commit -m "[ADDED] your_message_explaining_what_you_modified`
    Use different labels [ADDED] [CHANGED] [IMPROVED] [FIXED] [DELETED]
    to better understand what you did on branch

11. Switch to master to update code on master branch
    Type: `git checkout master`
    And then: `git pull`

12. Switch to your branch again
    Type `git checkout name_of_your_branch`
       
13. Type `git merge master` to make sure there won't be any conflicts in your future PR.
    You will se "Already up to date" in terminal.

14. If there is no conflicts, you can push to github
    Type `git push name_of_your_branch`
    The name of your local branch must match the name of your remote branch.
    Example (You can see in terminal):
    `* [new branch]      nik -> nik`

15. Repeat steps 5-15 for each change


