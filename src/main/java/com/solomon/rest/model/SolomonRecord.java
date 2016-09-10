package com.solomon.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Ignore unknown properties
@JsonIgnoreProperties(ignoreUnknown=true)
public class SolomonRecord
{
	@JsonIgnore String jsonText;
	
//    private String errorMessage;
//
//    private String currentDimensionSet;
//
//    private String[] solution_array;
//
//    private String maxRelationships;

    private String currentScreen;

//    private String prev_input;
//
    private List<AttributeSetData> attributeSetData;
//
//    private String age;
//
//    private String gender;
//
//    private String userName;
//
//    private String currentHealthState;
//
//    private TimeTradeOffList[] timeTradeOffList;

    private List<Relationships> relationships;

//    private String[] sortedAttributeData;
//
//    private HashTable hashTable;
//
//    private String solution_array_counter;
//
//    private AttributeSets[] attributeSets;
//
//    private String errorFlag;
//
//    private String interviewLocation;
//
//    private String start_top;
//
//    private String usedRelationships;
//
//    private String currentRelationshipSet;
//
//    private String attributeSetNum;
//
//    private String currentTimeTradeOffList;
//
//    private String selectedLifeTimeTradeOff;
//
//    private String step;
//
//    public String getErrorMessage ()
//    {
//        return errorMessage;
//    }
//
//    public void setErrorMessage (String errorMessage)
//    {
//        this.errorMessage = errorMessage;
//    }
//
//    public String getCurrentDimensionSet ()
//    {
//        return currentDimensionSet;
//    }
//
//    public void setCurrentDimensionSet (String currentDimensionSet)
//    {
//        this.currentDimensionSet = currentDimensionSet;
//    }
//
//    public String[] getSolution_array ()
//    {
//        return solution_array;
//    }
//
//    public void setSolution_array (String[] solution_array)
//    {
//        this.solution_array = solution_array;
//    }
//
//    public String getMaxRelationships ()
//    {
//        return maxRelationships;
//    }
//
//    public void setMaxRelationships (String maxRelationships)
//    {
//        this.maxRelationships = maxRelationships;
//    }
//
    public String getCurrentScreen ()
    {
        return currentScreen;
    }

    public void setCurrentScreen (String currentScreen)
    {
        this.currentScreen = currentScreen;
    }

//    public String getPrev_input ()
//    {
//        return prev_input;
//    }
//
//    public void setPrev_input (String prev_input)
//    {
//        this.prev_input = prev_input;
//    }
//
    public List<AttributeSetData> getAttributeSetData ()
    {
        return attributeSetData;
    }

    public void setAttributeSetData (List<AttributeSetData> attributeSetData)
    {
        this.attributeSetData = attributeSetData;
    }
//
//    public String getAge ()
//    {
//        return age;
//    }
//
//    public void setAge (String age)
//    {
//        this.age = age;
//    }
//
//    public String getGender ()
//    {
//        return gender;
//    }
//
//    public void setGender (String gender)
//    {
//        this.gender = gender;
//    }
//
//    public String getUserName ()
//    {
//        return userName;
//    }
//
//    public void setUserName (String userName)
//    {
//        this.userName = userName;
//    }
//
//    public String getCurrentHealthState ()
//    {
//        return currentHealthState;
//    }
//
//    public void setCurrentHealthState (String currentHealthState)
//    {
//        this.currentHealthState = currentHealthState;
//    }
//
//    public TimeTradeOffList[] getTimeTradeOffList ()
//    {
//        return timeTradeOffList;
//    }
//
//    public void setTimeTradeOffList (TimeTradeOffList[] timeTradeOffList)
//    {
//        this.timeTradeOffList = timeTradeOffList;
//    }

    public List<Relationships> getRelationships ()
    {
        return relationships;
    }

    public void setRelationships (List<Relationships> relationships)
    {
        this.relationships = relationships;
    }

//    public String[] getSortedAttributeData ()
//    {
//        return sortedAttributeData;
//    }
//
//    public void setSortedAttributeData (String[] sortedAttributeData)
//    {
//        this.sortedAttributeData = sortedAttributeData;
//    }
//
//    public HashTable getHashTable ()
//    {
//        return hashTable;
//    }
//
//    public void setHashTable (HashTable hashTable)
//    {
//        this.hashTable = hashTable;
//    }
//
//    public String getSolution_array_counter ()
//    {
//        return solution_array_counter;
//    }
//
//    public void setSolution_array_counter (String solution_array_counter)
//    {
//        this.solution_array_counter = solution_array_counter;
//    }
//
//    public AttributeSets[] getAttributeSets ()
//    {
//        return attributeSets;
//    }
//
//    public void setAttributeSets (AttributeSets[] attributeSets)
//    {
//        this.attributeSets = attributeSets;
//    }
//
//    public String getErrorFlag ()
//    {
//        return errorFlag;
//    }
//
//    public void setErrorFlag (String errorFlag)
//    {
//        this.errorFlag = errorFlag;
//    }
//
//    public String getInterviewLocation ()
//    {
//        return interviewLocation;
//    }
//
//    public void setInterviewLocation (String interviewLocation)
//    {
//        this.interviewLocation = interviewLocation;
//    }
//
//    public String getStart_top ()
//    {
//        return start_top;
//    }
//
//    public void setStart_top (String start_top)
//    {
//        this.start_top = start_top;
//    }
//
//    public String getUsedRelationships ()
//    {
//        return usedRelationships;
//    }
//
//    public void setUsedRelationships (String usedRelationships)
//    {
//        this.usedRelationships = usedRelationships;
//    }
//
//    public String getCurrentRelationshipSet ()
//    {
//        return currentRelationshipSet;
//    }
//
//    public void setCurrentRelationshipSet (String currentRelationshipSet)
//    {
//        this.currentRelationshipSet = currentRelationshipSet;
//    }
//
//    public String getAttributeSetNum ()
//    {
//        return attributeSetNum;
//    }
//
//    public void setAttributeSetNum (String attributeSetNum)
//    {
//        this.attributeSetNum = attributeSetNum;
//    }
//
//    public String getCurrentTimeTradeOffList ()
//    {
//        return currentTimeTradeOffList;
//    }
//
//    public void setCurrentTimeTradeOffList (String currentTimeTradeOffList)
//    {
//        this.currentTimeTradeOffList = currentTimeTradeOffList;
//    }
//
//    public String getSelectedLifeTimeTradeOff ()
//    {
//        return selectedLifeTimeTradeOff;
//    }
//
//    public void setSelectedLifeTimeTradeOff (String selectedLifeTimeTradeOff)
//    {
//        this.selectedLifeTimeTradeOff = selectedLifeTimeTradeOff;
//    }
//
//    public String getStep ()
//    {
//        return step;
//    }
//
//    public void setStep (String step)
//    {
//        this.step = step;
//    }
//
    @Override
    public String toString()
    {
        return "ClassPojo ["
//        		+ "errorMessage = "+errorMessage+""
//        		+ ", currentDimensionSet = "+currentDimensionSet+""
//        		+ ", solution_array = "+solution_array
//        		+ ", maxRelationships = "+maxRelationships
        		+ ", currentScreen = "+currentScreen
//        		+ ", prev_input = "+prev_input
        		+", attributeSetData = "+attributeSetData
//        		+", age = "+age
//        		+", gender = "+gender
//        		+", userName = "+userName
//        		+", currentHealthState = "+currentHealthState
//        		+", timeTradeOffList = "+timeTradeOffList
        		+", relationships = "+relationships
//        		+", sortedAttributeData = "+sortedAttributeData
//        		+", hashTable = "+hashTable
//        		+", solution_array_counter = "+solution_array_counter
//        		+", attributeSets = "+attributeSets
//        		+", errorFlag = "+errorFlag
//        		+", interviewLocation = "+interviewLocation
//        		+", start_top = "+start_top
//        		+", usedRelationships = "+usedRelationships
//        		+", currentRelationshipSet = "+currentRelationshipSet
//        		+", attributeSetNum = "+attributeSetNum
//        		+", currentTimeTradeOffList = "+currentTimeTradeOffList
//        		+", selectedLifeTimeTradeOff = "+selectedLifeTimeTradeOff
//        		+", step = "+step
        		+"]";
    }

	public String getJsonText() {
		return jsonText;
	}

	public void setJsonText(String jsonText) {
		this.jsonText = jsonText;
	}
}
