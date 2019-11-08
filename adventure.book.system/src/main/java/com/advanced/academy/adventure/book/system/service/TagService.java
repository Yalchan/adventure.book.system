package com.advanced.academy.adventure.book.system.service;

import com.advanced.academy.adventure.book.system.model.Tag;
import com.advanced.academy.adventure.book.system.model.adventure.Adventure;
import com.advanced.academy.adventure.book.system.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TagService {
    private final TagRepository tagRepository;

    @Autowired
    public TagService(TagRepository tegRepository) {
        this.tagRepository = tegRepository;
    }

    public void createOrUpdate(Tag tag) {
        tagRepository.save(tag);
    }

    public Tag getTagById(Integer tagId){
        Tag tag=null;
        Optional<Tag> result =tagRepository.findById(tagId);
        if(result.isPresent())
            tag=result.get();
        return tag;
    }

    public List<Tag> getTagByAdventureId(Integer adventureId){
        List<Tag>  tagList=new ArrayList<>();
        Adventure adventure = tagRepository.getReference(Adventure.class, adventureId);
        Optional<List<Tag>> result=tagRepository.findAllByAdventure(adventure);
        if(result.isPresent()){
            tagList.addAll(result.get());
        }
        return tagList;
    }

    public List<Tag> getAllTags(){
        List<Tag>  tagList=new ArrayList<>();
        Iterable<Tag> result=tagRepository.findAll();
        if(null!=result){
            result.forEach(tag->tagList.add(tag));
        }
        return tagList;
    }

}
