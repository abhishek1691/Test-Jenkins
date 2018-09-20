import git
from git import Repo
import time
from datetime import datetime,timezone,timedelta

def print_commit(commit):
    print('----')
    print(str(commit.hexsha))
    print("\"{}\" by {} ({})".format(commit.summary,
                                     commit.author.name,
                                     commit.author.email))
    print(str(commit.authored_datetime))
    print(str("count: {} and size: {}".format(commit.count(),commit.size)))

# def clone_repo(remote,local):
#      clone_res = git.Repo.clone_from(remote, local)
#      print(clone_res)
#      clone_res.git.checkout('beta')
#      clone_res.git.checkout('alpha')
#      clone_res.git.checkout('beta')  
     
      
        


if __name__ == "__main__":
    
    repo_path = "."
    # # clone_repo("https://github.com/abhishek1691/Test-Jenkins.git",repo_path)
    
    repo = Repo(repo_path)
    # check that the repository loaded correctly
    if not repo.bare:
        print('Repo at {} successfully loaded.'.format(repo_path))
        alpha = repo.branches['original/alpha']
        current = repo.active_branch
        print("active brance name::" + current.name)
        # repo.git.merge(alpha)
        # base = repo.merge_base(current, alpha)
        # repo.index.merge_tree(current, base=base)
        # repo.index.commit('Merge alpha into beta-final test ho gaya2',parent_commits=(current.commit, alpha.commit))
        # current.checkout(force=True)
        # repo.remotes.origin.push()
        now = datetime.now()
        yesterday = datetime.now() - timedelta(days=1)
        startDate = yesterday.date()
        endDate = now.date()
        print("startDate::"+ str(startDate))
        print("endDate::"+str(endDate))
        commits = list(repo.iter_commits(alpha.name))[:60]
        file=open('changelog.md', 'w')
        for commit in commits:

            if(str(endDate) in str(commit.authored_datetime) or (str(startDate) in str(commit.authored_datetime))) :
                print_commit(commit)
                file.write(str(commit.hexsha)+'\n') 
                file.write("\"{}\" by {} ({})".format(commit.summary,commit.author.name,commit.author.email)+'\n')
                file.write(str(commit.authored_datetime)+'\n \n')                         

                pass
        file.close() 
        # repo.git.add("commit.txt")   

    else:
        print('Could not load repository at {} :('.format(repo_path))
        file.close() 

