package com.zxd.core.util;

import java.io.File;
import java.io.IOException;




import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

public class LuceneUtil {
	public void createIndex( ) throws IOException{
		Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_46);
		IndexWriterConfig iwc =  new IndexWriterConfig(Version.LUCENE_46,analyzer );
		Directory directory = FSDirectory.open(new File("d:/index"));
		IndexWriter writer = new IndexWriter(directory, iwc);
		
		
		
		Document doc = new Document();
		
		/*Field field = new Field("title", "", type);
		Field field = new Field("title", "", type);
		doc.add(field);*/
		
		writer.addDocument(doc);
		
	}
	

}
