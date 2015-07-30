package com.endava.graduates.trainings.services;

import java.util.ArrayList;
import java.util.List;

import com.endava.graduates.trainings.file.FileReadInterface;
import com.endava.graduates.trainings.patterns.FileContentPattern;
import com.endava.graduates.trainings.patterns.SuperAgentPattern;
import com.endava.graduates.trainings.utils.StringUtils;

public class RankService {

	private FileReadInterface fileRead;

	public RankService(FileReadInterface fileRead) {
		this.fileRead = fileRead;
	}

	public boolean obtaintRankFromFile() throws Exception{
		String output = null;
		FileContentPattern pattern = new FileContentPattern();
		output = pattern.verifyContent(fileRead.readFromFile(), 7);
		List<String> ranks = new ArrayList<String>();
		ranks.add(StringUtils.toUpperCase("alfa"));
		ranks.add(StringUtils.concatStrings("be", "ta"));
		ranks.add(StringUtils.substringValue("terminator", 3));
		if(output != null) {
			ranks.add(output);
		}
		SuperAgentPattern superAgentPattern = new SuperAgentPattern();
		return superAgentPattern.checkIfSuperAgent(ranks);
	}

}
