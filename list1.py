#list
l1=[2011,2013,"anu","pratiksha"]
l2=[2021,22.22,2002,1111]
print "value of l1",l1
print ("value of ",l1[1])
print "value of ",l1[0:2]
print "length of list is:",len(l1)
print "minimum lenght",min(l2)	
print "maximum length",max(l2)
l1.append("sarita")
print "add update",l1
l1.append(2011)
print l1
c=l1.count(2011)
print  "count is",c
l1.extend(l2)
print l1
l2.insert(2,400)
print l2
#l1.pop(2)
print l1.pop()
print l1
l1.remove("anu")
print l1
l2.reverse()
print l2
l1.sort()
print l1

#directory
dict={'Name':'Anu','Age':50,'class':'bsc'};
print "dict['Name']:",dict['Name'];
print "dict['Age']:",dict['Age'];
dict['Age']=20
print "dict['Age']:",dict['Age']	#edit
dict['friend']="Sarita"
print "dict['friend']:",dict['friend']	#insert
#print dict  
del dict['Name']
print "dict['Name']",dict['Name']
dict.clear();
print  dict
#del dict
