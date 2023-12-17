package com.dcs.service;
 
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
 
import com.dcs.dto.VoteDTO;

import jakarta.validation.Valid;
 
@Service
public interface IVoteService {
 
	VoteDTO addVote(VoteDTO vote);
	//Page<VoteDTO> getAllVotes(int page, int size);
	Page<VoteDTO> getAllVotes(@Valid Pageable pageable);
 
}