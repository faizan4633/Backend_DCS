package com.dcs.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.dcs.dto.VoteDTO;
import com.dcs.exception.DeveloperCommunitySystemException;
import com.dcs.service.IVoteService;
import com.dcs.util.VoteType;
 
 
@RestController
@RequestMapping("/vote")
 
public class VoteController {
	@Autowired
	IVoteService voteService;
	
	@PostMapping(path="add",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VoteDTO> saveVote(@RequestBody VoteDTO vote, Integer userId) {
		VoteDTO newVote=voteService.addVote(vote, userId);
		return new ResponseEntity<VoteDTO>(newVote,HttpStatus.OK);
	}
	
	@GetMapping("all")
	public ResponseEntity<Page<VoteDTO>> getAllVotes(@RequestParam Pageable pageable) {
	    Page<VoteDTO> entities = voteService.getAllVotes(pageable);
	    return new ResponseEntity<Page<VoteDTO>>(entities, HttpStatus.OK);
		}
	
	 @GetMapping("/count/{voteType}/{responseId}")
	    public ResponseEntity<Integer> getVoteCountByTypeAndCommentId( @PathVariable VoteType voteType,@PathVariable Integer responseId ) {
	        Integer count = voteService.getNoOfVotesOnResponseByVoteType(voteType, responseId);
	        return new ResponseEntity<>(count, HttpStatus.OK);
	    }
 
}