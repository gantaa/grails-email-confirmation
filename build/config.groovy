
withConfig(configuration) {
    inline(phase: 'CONVERSION') { source, context, classNode ->
        classNode.putNodeMetaData('projectVersion', '3.0.0')
        classNode.putNodeMetaData('projectName', 'email-confirmation')
        classNode.putNodeMetaData('isPlugin', 'true')
    }
}
