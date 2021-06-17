/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/6/4 17:10
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.Jgit;

import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.models.Project;
import org.gitlab4j.api.models.ProtectedBranch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JgitSerivceImpl implements JgitSerivce{

    @Override
    public Object test() throws Exception{
        //创建一个 GitLabApi 实例来与你的 GitLab 服务器通信
        GitLabApi gitLabApi = GitLabApi.oauth2Login("http://15.116.20.220/", "lihui", "intadengyu5");
//        gitLabApi.getProtectedBranchesApi().getProtectedBranches()

         //获取您的帐户有权访问的项目
         List<Project> projects = gitLabApi.getProjectApi().getProjects();
        for (Project project : projects) {
            if ("boc-resource-manager".equals(project.getName())){
//                project.getB
                System.out.println(1);
//                project.bran
             project.setDefaultBranch("lihui");

//                project.
//                 gitLabApi.getB
//                System.out.println(protectedBranches);

            }
        }

        System.out.println(11);
         return "success";

    }
}
