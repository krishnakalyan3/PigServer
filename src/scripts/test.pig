A = load '/Users/krishna/IdeaProjects/PigServer/src/resource/data';
B = filter A by $0 > 2;
store B into '/Users/krishna/IdeaProjects/PigServer/src/resource/data/op';