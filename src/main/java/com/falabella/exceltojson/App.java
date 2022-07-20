package com.falabella.exceltojson;

import java.io.File;
import java.util.List;

import com.falabella.exceltojson.model.Project;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.poiji.bind.Poiji;

/**
 * Data from Excel file to Json format
 *
 */
public class App {
	public static void main(String[] args) {
	
		String path = "path-to-file";
		List<Project> projects = Poiji.fromExcel(new File(path), Project.class);
		Gson gson = new GsonBuilder()
				.setDateFormat("dd-MM-yyyy")
				.setPrettyPrinting().create();
		System.out.println(gson.toJson(projects));
	}
}
