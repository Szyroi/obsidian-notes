<%*
async function definition_description() {
  return await tp.system.prompt("Beschreibung der Definition:");
}

async function definition_formula() {
  return await tp.system.prompt("Formel (LaTeX):");
}

tp.user.definition_description = definition_description;
tp.user.definition_formula = definition_formula;
%>


> [!definition] Definition: <% tp.file.title %>
> <% tp.user.definition_description() %>
>
> $$
> <% tp.user.definition_formula() %>
> $$






