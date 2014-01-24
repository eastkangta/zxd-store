package com.zxd.core.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;




import java.io.Reader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.IOContext;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;

public class LuceneUtil {
	
	public static void main(String[] args) throws IOException {
		LuceneUtil util = new LuceneUtil();
		util.createIndex();
	}
	public void createIndex( ) throws IOException{
		Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_46);
		IndexWriterConfig iwc =  new IndexWriterConfig(Version.LUCENE_46,analyzer );
		Directory directory = FSDirectory.open(new File("d:/index"));
		IndexWriter writer = new IndexWriter(directory, iwc);
		
		
		
		File indexfile = new File("D:/kangta");
		
		if (indexfile.isDirectory() && indexfile.canRead()) {
			File files[] =   indexfile.listFiles();
			
			if( files.length > 0 ){
				for(File file : files){
					if( file.isFile()){
						Document doc = new Document();
						FieldType fieldType = new FieldType();
						fieldType.setStored(true);
						fieldType.setIndexed(true);
						
						Field field1 = new Field("title", file.getName(),fieldType);
						Field field2 = new TextField("content", new FileReader(file));
						doc.add(field1);
						doc.add(field2);
						writer.addDocument(doc);
					}
				}
			}
			
		}
	}
	public void queryIndex() throws IOException{
		Directory directory = FSDirectory.open(new File("d:/index"));
		DirectoryReader directoryReader = DirectoryReader.open(directory); 
		IndexReader reader = directoryReader.open(directory);
		
		
	}
	
	public void createRAMIndex() throws IOException{
		Directory directory = FSDirectory.open(new File("d:/index"));
		Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_46);
		IndexWriterConfig iwc =  new IndexWriterConfig(Version.LUCENE_46,analyzer );
		Directory ramDirectory = new RAMDirectory(directory,new IOContext().DEFAULT);
	}
	

}
