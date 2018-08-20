package com.yang.workflow;


import java.util.ArrayList;
import java.util.List;

public class WorkFlow {
    private List<Work> works;
    private List<WorkFlow> workFlows;

    public WorkFlow next(Work work){
        if (works == null){
            works = new ArrayList<>();
        }
        works.add(work);
        return this;
    }

    public WorkFlow next(WorkFlow workFlow){
        if (workFlows == null){
            workFlows = new ArrayList<>();
        }
        workFlows.add(workFlow);
        return this;
    }

    public void start(){
        if (works != null) {
            for (int i = 0; i < works.size(); i++){
                Work work = works.get(i);
                work._Call();
            }
        }
        if (workFlows != null){
            for (int i = 0; i < workFlows.size(); i++){
                WorkFlow workFlow = workFlows.get(i);
                workFlow.start();
            }
        }
    }


}
