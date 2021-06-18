echo "Executing powershell scripting ..."
$FileName = "test.html"
if (Test-Path $FileName) 
{
  Remove-Item $FileName
}
New-Item test.html
Clear-Content test.html
Add-Content test.html "<html><h2>PowerShell is a more powerful scripting language</h2></html>"