
public class j203 {

	public static void main(String[] args) {
		
		String str_temp="南海仲裁結果出爐，對大陸是「大壞」收場。先前南海已因美航母戰鬥群、導彈驅逐艦進駐，及陸三大艦隊軍演而劍拔弩張；為防形勢失控，展現護土決心，《博聞社》昨稱，中共軍委主席習近平已向軍方發出作戰令，要求不惜一戰捍衛南海主權和領土完整。南部戰區已進入一級戰備，南海艦隊、火箭軍和空軍進入戰前狀態，南海火藥桶一點即爆。";
		
		String str[]=str_temp.split("，");
		System.out.println("將逗號隔開的字串個數有:"+str.length);
	
			for(int i=0;i<str.length;i++){
				System.out.println(i+1+"，"+str[i]);
				
			}
	}

}
