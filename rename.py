import os 
import shutil 

def copy_files_with_prefix(source_folder, destination_folder, prefix):
    # Ensure the destination folder exists
    os.makedirs(destination_folder, exist_ok=True)
    # Iterate through all the files in the source folder
    for filename in os.listdir(source_folder):
        # Construct the full file path
        source_file = os.path.join(source_folder, filename)
        
        # Check if it's a file (not a directory)
        if os.path.isfile(source_file):
            # Create the new filename with the prefix
            new_filename = prefix + filename
            
            # Construct the full path for the destination file
            destination_file = os.path.join(destination_folder, new_filename)
            
            # Copy the file
            shutil.copy2(source_file, destination_file)
            print(f"Copied: {source_file} to {destination_file}")
# Example usage copy_files_with_prefix('path/to/source/folder', 
# 'path/to/destination/folder', 'prefix_')
copy_files_with_prefix('thalia-android', 'snippets-thalia/thalia-cs', "Android")
copy_files_with_prefix('thalia-gwt', 'snippets-thalia/thalia-cs', "GWT")
copy_files_with_prefix('thalia-hibernate', 'snippets-thalia/thalia-cs', "Hibernate")
copy_files_with_prefix('thalia-joda', 'snippets-thalia/thalia-cs', "Joda")
copy_files_with_prefix('thalia-rt', 'snippets-thalia/thalia-cs', "RT")
copy_files_with_prefix('thalia-xstream', 'snippets-thalia/thalia-cs', "XStream")
